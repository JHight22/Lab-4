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

        Car Car = new Car(2007, "Toyota");

        for (int i = 1; i <= 5; i++) {
            Car.accelerate();
            System.out.println("Current speed of the " + Car.getYearModel() + " " + Car.getMake() + " is " + Car.getSpeed());
        }

        System.out.println("------------------");

        for (int i = 1; i <= 5; i++) {
            Car.brake();
            System.out.println("Current speed of the " + Car.getYearModel() + " " + Car.getMake() + " is " + Car.getSpeed());
        }
    }
}
