/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Admin
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
        double sum=0.0;
      
         for (double x:revenue){
             sum+=x;

         }
      
       System.out.println(sum/(revenue.length));
    }
}
  
    

