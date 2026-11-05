
import java.util.Locale;
public class Task2WorkstationConfigurator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Motherboard board = new Motherboard("ASUS ROG B650", "AM5", 4);
        PowerSupplyUnit psu = new PowerSupplyUnit("Seasonics 750W Gold", 750, 0.90);
        WorkstationPC pc = new WorkstationPC("DeepLearning-Rig", board, psu);

        ProcessorUnit intel = new ProcessorUnit("Intel Core i9", 22000, "LGA1700", 24, 5.8, 253);
        ProcessorUnit ryzen = new ProcessorUnit("AMD Ryzen 9 7950X", 26900, "AM5", 16, 5.7, 170);
        GraphicsAccelerator gpu = new GraphicsAccelerator("NVIDIA RTX 4080 Super", 42000, 16, 552, 320);
        GraphicsAccelerator bigGpu = new GraphicsAccelerator("NVIDIA RTX 4090", 90000, 24, 512, 450);

        int[] samples = {7400, 7450, 7500};
        NvmeSsdDrive ssd = new NvmeSsdDrive("Samsung 990 Pro 2TB", 10000, 2000, 7450, samples);

        System.out.println("================ КОНФІГУРАТОР РОБОЧОЇ СТАНЦІЇ (КОМПОЗИЦІЯ) ================");
        System.out.println("[ПЕРЕВІРКА СУМІСНОСТІ]:");
        pc.installComponent(intel);
        pc.installComponent(ryzen);
        pc.installComponent(gpu);
        pc.installComponent(ssd);
        pc.installComponent(bigGpu);

        System.out.println();
        System.out.println(pc);

        samples[0] = 0;
        System.out.println("Змінили зовнішній масив, у SSD: " + ssd.getSpeedSamples()[0]);
        ssd.getSpeedSamples()[1] = 0;
        System.out.println("Змінили масив з геттера, у SSD: " + ssd.getSpeedSamples()[1]);
        System.out.println("===========================================================================");
    }
}

class Motherboard {
    private final String model;
    private final String socketType;
    private final int maxExpansionSlots;

    public Motherboard(String model, String socketType, int maxExpansionSlots) {
        if (maxExpansionSlots < 1 || maxExpansionSlots > 8) {
            throw new IllegalArgumentException("Слотів має бути від 1 до 8");
        }
        this.model = model;
        this.socketType = socketType;
        this.maxExpansionSlots = maxExpansionSlots;
    }

    public String getModel() {
        return model;
    }

    public String getSocketType() {
        return socketType;
    }

    public int getMaxExpansionSlots() {
        return maxExpansionSlots;
    }

    public boolean isSocketCompatible(String cpuSocket) {
        return socketType.equalsIgnoreCase(cpuSocket);
    }
}

class PowerSupplyUnit {
    private final String model;
    private final int maxOutputWatts;
    private final double efficiencyCoefficient;

    public PowerSupplyUnit(String model, int maxOutputWatts, double efficiencyCoefficient) {
        if (efficiencyCoefficient < 0.80 || efficiencyCoefficient > 0.96) {
            throw new IllegalArgumentException("ККД має бути в межах [0.80; 0.96]");
        }
        this.model = model;
        this.maxOutputWatts = maxOutputWatts;
        this.efficiencyCoefficient = efficiencyCoefficient;
    }

    public String getModel() {
        return model;
    }

    public double getEfficiencyCoefficient() {
        return efficiencyCoefficient;
    }

    // безпечна потужність із запасом 15%
    public int getSafeContinuousWatts() {
        return (int) (maxOutputWatts * 0.85);
    }

    // скільки реально береться з розетки
    public double calculateWallPowerDraw(int internalLoadWatts) {
        return internalLoadWatts / efficiencyCoefficient;
    }
}

abstract class AbstractHardwareComponent {
    private final String modelName;
    private final double priceUah;

    public AbstractHardwareComponent(String modelName, double priceUah) {
        if (priceUah < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною");
        }
        this.modelName = modelName;
        this.priceUah = priceUah;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPriceUah() {
        return priceUah;
    }

    public abstract int getPowerWatts();

    public abstract double getBenchmarkScore();

    public abstract String getCategory();

    @Override
    public String toString() {
        return "[" + getCategory() + "] " + modelName + " (" + getPowerWatts()
                + " Вт | Score: " + String.format("%.1f", getBenchmarkScore()) + ")";
    }
}

class ProcessorUnit extends AbstractHardwareComponent {
    private final String socket;
    private final int cores;
    private final double boostClockGhz;
    private final int tdpWatts;

    public ProcessorUnit(String modelName, double priceUah, String socket, int cores, double boostClockGhz, int tdpWatts) {
        super(modelName, priceUah);
        this.socket = socket;
        this.cores = cores;
        this.boostClockGhz = boostClockGhz;
        this.tdpWatts = tdpWatts;
    }

    public String getSocket() {
        return socket;
    }

    @Override
    public int getPowerWatts() {
        return tdpWatts;
    }

    @Override
    public double getBenchmarkScore() {
        return cores * boostClockGhz * 120.0;
    }

    @Override
    public String getCategory() {
        return "CPU";
    }
}

class GraphicsAccelerator extends AbstractHardwareComponent {
    private final int vramGb;
    private final int tensorCores;
    private final int boardPowerWatts;

    public GraphicsAccelerator(String modelName, double priceUah, int vramGb, int tensorCores, int boardPowerWatts) {
        super(modelName, priceUah);
        this.vramGb = vramGb;
        this.tensorCores = tensorCores;
        this.boardPowerWatts = boardPowerWatts;
    }

    @Override
    public int getPowerWatts() {
        return boardPowerWatts;
    }

    @Override
    public double getBenchmarkScore() {
        return vramGb * 250.0 + tensorCores * 1.5;
    }

    @Override
    public String getCategory() {
        return "GPU";
    }
}

class NvmeSsdDrive extends AbstractHardwareComponent {
    private final int capacityGb;
    private final int readSpeedMbSec;
    private final int[] speedSamples;

    public NvmeSsdDrive(String modelName, double priceUah, int capacityGb, int readSpeedMbSec, int[] speedSamples) {
        super(modelName, priceUah);
        this.capacityGb = capacityGb;
        this.readSpeedMbSec = readSpeedMbSec;
        // захисна копія масиву
        this.speedSamples = (speedSamples != null) ? speedSamples.clone() : new int[0];
    }

    public int[] getSpeedSamples() {
        // повертаємо копію
        return speedSamples.clone();
    }

    @Override
    public int getPowerWatts() {
        return 12;
    }

    @Override
    public double getBenchmarkScore() {
        return readSpeedMbSec * 0.25;
    }

    @Override
    public String getCategory() {
        return "NVMe SSD";
    }
}
class WorkstationPC {
    private final String buildName;
    private final Motherboard motherboard;
    private final PowerSupplyUnit psu;
    private final AbstractHardwareComponent[] components;
    private int componentCount;

    public WorkstationPC(String buildName, Motherboard motherboard, PowerSupplyUnit psu) {
        this.buildName = buildName;
        this.motherboard = motherboard;
        this.psu = psu;
        this.components = new AbstractHardwareComponent[motherboard.getMaxExpansionSlots()];
        this.componentCount = 0;
    }

    public boolean installComponent(AbstractHardwareComponent comp) {
        if (comp == null) {
            System.out.println("❌ Відмова: компонент не вказано!");
            return false;
        }

        if (componentCount >= motherboard.getMaxExpansionSlots()) {
            System.out.println("❌ Відмова: немає вільних слотів для " + comp.getModelName() + "!");
            return false;
        }
        if (comp instanceof ProcessorUnit) {
            ProcessorUnit cpu = (ProcessorUnit) comp;
            if (!motherboard.isSocketCompatible(cpu.getSocket())) {
                System.out.println("❌ Відмова: Процесор " + cpu.getModelName() + " (" + cpu.getSocket()
                        + ") несумісний із платою " + motherboard.getModel()
                        + " (Сокет " + motherboard.getSocketType() + ")!");
                return false;
            }
        }
        if (getTotalPowerWatts() + comp.getPowerWatts() > psu.getSafeContinuousWatts()) {
            System.out.println("❌ Відмова: " + comp.getModelName() + " перевантажить блок живлення (ліміт "
                    + psu.getSafeContinuousWatts() + " Вт)!");
            return false;
        }
        components[componentCount] = comp;
        componentCount++;
        System.out.println("✅ Встановлено: " + comp);
        return true;
    }

    public int getTotalPowerWatts() {
        int sum = 0;
        for (int i = 0; i < componentCount; i++) {
            sum += components[i].getPowerWatts();
        }
        return sum;
    }

    public double getTotalSystemScore() {
        double sum = 0;
        for (int i = 0; i < componentCount; i++) {
            sum += components[i].getBenchmarkScore();
        }
        return sum;
    }

    public double getTotalBuildPrice() {
        double sum = 0;
        for (int i = 0; i < componentCount; i++) {
            sum += components[i].getPriceUah();
        }
        return sum;
    }

    @Override
    public String toString() {
        int power = getTotalPowerWatts();
        String status = (power <= psu.getSafeContinuousWatts()) ? "СТАБІЛЬНО!" : "ПЕРЕВАНТАЖЕННЯ!";
        return "[ПАСПОРТ ЗБІРКИ '" + buildName + "']:\n"
                + "  Материнська плата: " + motherboard.getModel() + " (Socket: " + motherboard.getSocketType()
                + ", Слотів: " + componentCount + "/" + motherboard.getMaxExpansionSlots() + ")\n"
                + "  Блок живлення:     " + psu.getModel() + " (Безпечний ліміт 85%: " + psu.getSafeContinuousWatts()
                + " Вт, ККД: " + Math.round(psu.getEfficiencyCoefficient() * 100) + "%)\n"
                + "  Внутрішнє споживання: " + power + " Вт (З розетки з урахуванням ККД: "
                + String.format("%.2f", psu.calculateWallPowerDraw(power)) + " Вт) -> " + status + "\n"
                + "  Сумарний індекс продуктивності: " + String.format("%.2f", getTotalSystemScore()) + " балів\n"
                + "  Загальна вартість конфігурації: " + String.format("%.2f", getTotalBuildPrice()) + " грн";
    }
}