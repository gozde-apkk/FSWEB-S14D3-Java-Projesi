package Model2;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        return getName()+" is starting";
    }
    public String drive(){
        runEngine(this);
        return getName()+" is driving";
    }
    private void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            //((GasPoweredCar)carSkeleton).
            System.out.println("The car engine is starting with gas.");
        } else if(carSkeleton instanceof HybridCar){
            System.out.println("The car engine is starting with both gas and electric.");
        } else if(carSkeleton instanceof ElectricCar){
            ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            System.out.println("The car engine is starting with electric.");
        } else{
            System.out.println("Car type is not valid");
        }
    }
}
