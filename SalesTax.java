/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salestax;

import java.util.Scanner;

/**lefa motsoeneng
 *ST10449687
 * @author RC_Student_lab
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Double Tax Rate = 0,55;
        double price ;
        double tax = 0 ;
        double total ;
        String item ;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("item description");
        item = keyboard.nextLine();
        System.out.println("item price $");
        price = keyboard.nextDouble();
        
        Tax = price + Rate;
        double Total = price * tax;
        System.out.println(item + "$");
        System.out.println("price");
        System.out.println("tax $");
        System.out.println(tax);
        
        
    }
    
}
