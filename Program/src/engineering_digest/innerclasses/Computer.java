package engineering_digest.innerclasses;

public class Computer {
    public OperatingSystem getOs() {
        return os;
    }
    private String brand;
    private String model;

    private OperatingSystem os;

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

      class OperatingSystem {
         private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo(){
            System.out.println("Computer Model: "+ model + " ,OS: "+ osName);
        }
    }
}
