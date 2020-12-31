/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev_n_u;

/**
 * CSC 206 Mr. Osborne
 *
 * @author Isaiah J Jones 2-8-17
 */ 
//Import Scanner
import java.util.Scanner;

public class Rev_N_U {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declare variables
        int rev1, rev2, rev3, rev4, rev5;
        int x = 100;
        int div1, div2, div3, div4, div5;
        String astrsk = "*";
        //Prompt User for 5 revenues
        System.out.println("Enter the revenues from the 5 branch stores:");

        //Store the revenues
        Scanner input = new Scanner(System.in);
        rev1 = input.nextInt();
        rev2 = input.nextInt();
        rev3 = input.nextInt();
        rev4 = input.nextInt();
        rev5 = input.nextInt();

        //Build line graphs using asterisks "*"
        
// Calculate the number of needed asterisks
        div1 = rev1 / x;
        div2 = rev2 / x;
        div3 = rev3 / x;
        div4 = rev4 / x;
        div5 = rev5 / x;
//Print out the Revenues and Bar Graphs
        System.out.print("Store1: $ " + rev1 + " ");
        for (int y = 1; y <= div1; y++) {
            System.out.print(astrsk);
        }
        System.out.println(" ");
        System.out.print("Store2: $ " + rev2 + " ");
        for (int y = 1; y <= div2; y++) {
            System.out.print(astrsk);
        }
        System.out.println(" ");
        System.out.print("Store3: $ " + rev3 + " ");
        for (int y = 1; y <= div3; y++) {
            System.out.print(astrsk);

        }
        System.out.println(" "); 
        System.out.print("Store4: $ " + rev4 + " ");
        for (int y = 1; y <= div4; y++) {
            System.out.print(astrsk);
        }
        System.out.println(" ");
        System.out.print("Store5: $ " + rev5 + " ");
        for (int y = 1; y <= div5; y++) {
            System.out.print(astrsk);
        }
    }

}
