/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.util.Scanner;

/**
 *
 * @author ADITI RAO
 */
public class MiniProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

/**
 * This class computes the Total paintable area of either the whole building or
 * a room
 *
 * @author ADITI RAO
 */
class Building {

    double totalPaintArea[];
    final Scanner in = new Scanner(System.in);

    /**
     * This function gets the user to get number of rooms & their dimensions to
     * paint
     *
     * @author ADITI RAO
     * @return totalPaintArea
     */
    public double[] menu() {
        System.out.println("Do you want to paint?Enter\n1] for a room\n2] for a building");
        int choice = in.nextInt();

        if (choice == 1) {

            totalPaintArea = new double[1];
            Room r = new Room();
            System.out.println("Room 1");

            totalPaintArea[0] = r.getPaintableArea();

            return totalPaintArea;

        } else if (choice == 2) {

            System.out.println("Enter the number of rooms you want to paint:");
            int n = in.nextInt();

            Room[] r = new Room[n];
            totalPaintArea = new double[n];

            for (int index = 0; index < n; index++) {

                System.out.println("Room " + (index + 1));
                totalPaintArea[index] = r.getPaintableArea();

            }

            return totalPaintArea;

        } else {

            System.out.println("Enter correct choice");
            return null;
        }
    }

} //end of class Building