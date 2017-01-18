/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

import java.util.Scanner;
 
public class Radius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the radius!");
        
        int number=Integer.parseInt(input.nextLine());
        
        System.out.println("The radius is " + " " + number);
        int a=2;
        double C=a*number*Math.PI;
        System.out.println("The C is " + " " + C);
        
      
      
      
        
        // TODO code application logic here
    
}
}