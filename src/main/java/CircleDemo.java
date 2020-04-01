
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jared
 */
public class CircleDemo {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        System.out.println("Please enter the radius of a circle in meters");

        Scanner keyboard = new Scanner(System.in);

        Circle circle = new Circle(keyboard.nextDouble());
        System.out.println("------------------");
        System.out.println("The area of the circle is " + df.format(circle.getArea()) + " meters");
        System.out.println("The diameter of the circle is " + df.format(circle.getDiameter()) + " meters");
        System.out.println("The circumference of the circle is " + df.format(circle.getCircumference()) + " meters");
    }
}
