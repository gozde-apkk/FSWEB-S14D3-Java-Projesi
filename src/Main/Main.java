package Main;

import Model1.Car;
import Model1.Ford;
import Model1.Holden;
import Model1.Mitsubishi;
import Model2.CarSkeleton;
import Model2.ElectricCar;
import Model2.GasPoweredCar;
import Model2.HybridCar;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());


        System.out.println("Model2 ******************");


        System.out.println("*********************************************");
        System.out.println("[B] CarSkeleton Sınıfı Testleri:");
        System.out.println("---------------------------------------------------------");
        System.out.println("[1] carSkeleton Objesi Yaratma:");
        CarSkeleton carSkeleton = new CarSkeleton("Citroen", "C3");
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());
        System.out.println("[2] carSkeleton Sınıfına Ait electricCar tipinde obje yaratma:");
        CarSkeleton electricCar = new ElectricCar("Citroen", "Model: Ami", 5.9, 5);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());
        System.out.println("[3] carSkeleton Sınıfına Ait electricCar tipinde obje yaratma:");
        CarSkeleton gasPoweredCar = new GasPoweredCar("Citroen", "Model: C4", 4.8, 4);
        System.out.println(gasPoweredCar.startEngine());
        System.out.println(gasPoweredCar.drive());
        System.out.println("[4] carSkeleton Sınıfına Ait hybridCar tipinde obje yaratma:");
        CarSkeleton hybridCar = new HybridCar("Toyota", "Model: Corolla", 4.6, 5, 4);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
    }
