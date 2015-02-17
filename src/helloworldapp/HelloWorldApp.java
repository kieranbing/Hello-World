/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int x = 3; 
        /*for (int i=0; i<=5; i++){
        System.out.println("Hello World!"); // Display the string.
        } 
        
        System.out.println("Hello Boobies!"); // Display the string.
        
        for (int i=0; i <= 10; i++){
		System.out.println(i);
	}
      
      int [] numbers = {10, 20, 30, 40, 50};//Create array
      for(int x : numbers ){
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
     
      /*String [] names ={"James", "Larry", "Tom", "Lacy"};
      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
        int x = 0;
	do{ 
		System.out.print(x + ", ");
		x++; 
	}while(x < 6);
        */ 
        int i = 1; 
        while (i <= 100){
             i++;	
            if (i/10 ==6){
        		break;
		}
		else if (i%10 ==0){
			System.out.print("\n");
        		continue; 
                }
            System.out.print(i + ", ");
        }
    }
    
}
