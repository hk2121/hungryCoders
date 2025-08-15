package engineering_digest.innerclasses;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn= false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
//    class Engine{
//        void start(){
//            if(!isEngineOn){
//                isEngineOn = true;
//                System.out.println(model + "engine started.");
//            }else{
//                System.out.println(model + " engine is already on.");
//            }
//        }
//
//            void stop() {
//                if (!isEngineOn) {
//                    isEngineOn = false;
//                    System.out.println(model + "engine stopped.");
//                } else {
//                    System.out.println(model + " engine is already off.");
//                }
//            }
//    }

}
