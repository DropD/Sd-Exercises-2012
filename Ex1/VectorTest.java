/**
 * Simple demonstration class using the vector class.
 * @author Ren&eacute; M&uuml;ller
 */
public class VectorTest {

	/**
	 * Here starts the execution of the application.
	 * @param args Command line arguments passed to the application (not used).
	 */
	public static void main(String[] args) {
		// Create two new vectors
		Vector a = new Vector(1,2,3);
		Vector b = new Vector(3,2,1);
		
		System.out.println("a="+a.toString());
		System.out.println("b="+b.toString());
		System.out.println("|a|="+a.getNorm());
		System.out.println("(a,b)="+a.dot(b));
		
		a.add(b);
		System.out.println("a="+a);
		a.normalise();
		System.out.println("a="+a.toString());
	
	}
}
