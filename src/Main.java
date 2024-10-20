import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  boolean exit = true;
	  do {
	  System.out.print("Introduce un valor: ");
	  double valor = scan.nextDouble();
	  
	    try{
	    System.out.println(CalculosNumericos.logN(valor));
	    System.out.println(CalculosNumericos.raiz(valor));
	    exit = true;
	    } catch(ArithmeticException e) {
		  System.err.println("Error: "+e.getMessage());
		  exit = false;
	    }

	  }while(!exit);
	  scan.close();
	}
}
