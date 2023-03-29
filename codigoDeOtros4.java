
import java.util.Scanner;

public class codigoDeOtros4 {
	public static void main(String[] args) { /*agregar método main  */

	    Scanner s = new Scanner(System.in); /*agregar system.in*/
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);/*agregar system.in*/
	    String j2 = s2.nextLine();
	    /* retirar parentesis extra 
	    if (j1 == j2){
	      System.out.println("Empate");
	    } else if(j1 == "piedra" && j2=="tijeras"){
	    	System.out.println("Gana jugador 1");
	    }
	      else if (j1 == "papel" && j2 == "tijeras" ) {
	    	  System.out.println("Gana jugador 2");
	      }
	      else if (j1 == "tijeras" && j2 == "piedra") {
	      }
	    */
	    switch(j1) {
	    case "piedra":
	    }
	    	  
	    	  
	    	int g=1;
	    	int j= 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            System.out.println(g);
	          }else {
	        	  System.out.println(j);
	          }
	          break;

	        case "papel":
	          if (j2 == "piedra") {
	            System.out.println(g); 
	          }else
	        	  System.out.println(j);
	          break;
	        case "tijeras":
	          if (j2 =="papel") {
	        	  System.out.println( g);
	          }else {
	        	  System.out.println(j);
	          }
	          break;
	        default: 
	          System.out.print("no es una opción valida");
	      }
	      System.out.println("Gana el jugador " + g);
	  }
	}
	  
	  