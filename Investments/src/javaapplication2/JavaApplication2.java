/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author JONATAN
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double eco = 0;
       double econ = 0;
       double dezpc = 0;
       double liq = 1200;
       double liq10 = (liq * 0.30);
       eco = (liq * 0.30);
       econ = (liq * 0.30);
      
       String liquido, economia, normal;
       System.out.println("___________________________________________________________________");
       System.out.println("\tliquido\t\t" + "economia\t\t" + "economia normal" );
       liquido = String.format("%.2f", (liq - liq10));
       economia = String.format("%.2f", eco);
       normal = String.format("%.2f", econ);
       System.out.print("1        " + liquido );
       System.out.print("\t          " + economia );
       System.out.println( "\t\t         " + normal );
       
       for( int x = 2; x < 25; x++ ) {
          dezpc = (eco * 0.10);
          econ += (liq* 0.30);
          eco = eco - dezpc;
          liq10 = liq + dezpc;
          eco += (liq10*0.30);
          
          liquido = String.format("%.2f", (liq10 - (liq10 *0.30)) );
          liquido = x + (liquido.length() > 6 ? "              ".substring("              ".length() - liquido.length()) + liquido : "        " + liquido ); 
          //liquido = liquido.length() >= 7 ? x + "        " + liquido : x + "        " + liquido; 
          
          economia = String.format("%.2f", eco);
          economia = "\t\t" + (economia.length() >= 7 ? " "  + economia : "  "  + economia);
          
          normal = String.format("%.2f", econ);
          normal = "\t\t\t" + (normal.length() >= 7 ? normal : " "  + normal);
          
          System.out.print(liquido);
          System.out.print(economia);
          System.out.println(normal);
       }
    }
    
}
