package Model1;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        setEngine(true);
        setWheels(4);
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("Name: "+name+"\n");
        builder.append("Cylinder: "+cylinders+"\n");
        return builder.toString();
    }

    public String startEngine() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car is braking";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//bu sınıfın remdeki yeri ile o'nun adresi aynı mı
        if (o == null|| getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return this.cylinders == car.cylinders && name.equals(car.name);
    }
}
