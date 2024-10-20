
// TODO: Auto-generated Javadoc
/**
 * The Class CalculosNumericos.
 */
public class CalculosNumericos {
	
	/**
	 * Log N.
	 *
	 * @param valor the valor
	 * @return the double
	 */
	public static double logN(double valor) {
	  if(valor < 0) {
	    throw new ArithmeticException("El valor debe de ser positivo");
	  }
	  return Math.log(valor);
	}
	
	/**
	 * Raiz.
	 *
	 * @param valor the valor
	 * @return the double
	 */
	public static double raiz(double valor) {
	  if(valor < 0) {
	    throw new ArithmeticException("El valor debe de ser positivo");
	  }
	  return Math.sqrt(valor);
	}
	
}
