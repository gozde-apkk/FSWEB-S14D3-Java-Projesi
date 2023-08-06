package Model1;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "the Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        return "the Ford is accelerating";
    }

    @Override
    public String brake() {
        return "the Ford is braking";
    }
}
