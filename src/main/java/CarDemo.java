/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jared
 */
public class CarDemo {

    public static void main(String[] args) {

        Car Car1 = new Car(2007, "Honda");
        Car Car2 = new Car(2015, "Ford");
        Car Car3 = new Car(2002, "Toyota");
        Car Car4 = new Car(2019, "Mercedes");
        Car Car5 = new Car(2000, "Chevrolet");

        System.out.println(Car1.getYearModel() + ", "
                + Car1.getMake() + ", "
                + accelerate(37));

        System.out.println(Car2.getYearModel() + ", "
                + Car2.getMake() + ", "
                + accelerate(78));

        System.out.println(Car3.getYearModel() + ", "
                + Car3.getMake() + ", "
                + accelerate(46));

        System.out.println(Car4.getYearModel() + ", "
                + Car4.getMake() + ", "
                + accelerate(13));

        System.out.println(Car5.getYearModel() + ", "
                + Car5.getMake() + ", "
                + accelerate(67));

        System.out.println("------------------------");

        System.out.println(Car1.getYearModel() + ", "
                + Car1.getMake() + ", "
                + brake(34));

        System.out.println(Car2.getYearModel() + ", "
                + Car2.getMake() + ", "
                + brake(37));

        System.out.println(Car3.getYearModel() + ", "
                + Car3.getMake() + ", "
                + brake(89));

        System.out.println(Car4.getYearModel() + ", "
                + Car4.getMake() + ", "
                + brake(24));

        System.out.println(Car5.getYearModel() + ", "
                + Car5.getMake() + ", "
                + brake(23));

    }

    public static int accelerate(int speed) {
        int acceleratedSpeed = speed + 5;

        return acceleratedSpeed;
    }

    public static int brake(int speed) {
        int speedBrake = speed - 5;

        return speedBrake;
    }
}
