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
       double liq = 1000;
       double liq10 = (liq * 0.30);
       eco = (liq * 0.30);
       econ = (liq * 0.30);
      
       String liquido, economia, normal;
       System.out.println("___________________________________________________________________");
       System.out.println("\tliquido\t\t" + "economia\t" + "economia normal" );
       liquido = String.format("%.2f", (liq - liq10));
       economia = String.format("%.2f", eco);
       normal = String.format("%.2f", econ);
       System.out.print("1\t " + liquido );
       System.out.print("\t          " + economia );
       System.out.println( "\t         " + normal );
       
       for( int x = 2; x < 194; x++ ) {
          String space;
           dezpc = (eco * 0.10);
          econ += (liq* 0.30);
          eco = eco - dezpc;
          liq10 = liq + dezpc;
          eco += (liq10*0.30);
          
          liquido = String.format("%.2f", (liq10 - (liq10 *0.30)) );
          space =  ("       ").substring( 0, 7);
          liquido =  x + "\t" + ( space.substring(0, space.length() - liquido.length() ) + liquido ); 
          
          economia = String.format("%.2f", eco);
          space = "          ".substring(0, 8);
          economia = "\t\t" + ( space.substring(0, space.length() - economia.length() ) + economia ); 
          
          normal = String.format("%.2f", econ);
          space = "               ".substring(0, 15);
          normal = "\t" + ( space.substring(0, space.length() - normal.length() ) + normal ); 
          
          System.out.print(liquido);
          System.out.print(economia);
          System.out.println(normal);
       }
    }
    
}
