/**
 * Implementation of a 3-D vector for demontration purposes.
 * 
 * @author Ren&eacute; M&uuml;ller
 */
public class Vector extends Object{
	/** x-component */
	private double x;

	/** y-component */
	private double y;

	/** z-component */
	private double z;

	/**
	 * Creates a new vector.
	 * 
	 * @param x
	 *            initializes x-component
	 * @param y
	 *            initializes y-component
	 * @param z
	 *            initializes z-component
	 */
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/** Creates a null-vector. */
	public Vector() {
		// This assignments are not strictly required since the fields of an
		// object are initialized to zero by default.
		x = 0;
		y = 0;
		z = 0;
	}

	/**
	 * Adds a vector to this vector.
	 * 
	 * @param v
	 *            Vector to add (vector is not changed.)
	 */
	public void add(Vector v) {
		x += v.x;
		y += v.y;
		z += v.z;
	}

	/**
	 * Subtracts a vector to this vector.
	 * 
	 * @param v
	 *            Vector to add (vector is not changed.)
	 */
	public void sub(Vector v) {
		x -= v.x;
		y -= v.y;
		z -= v.z;
	}

	/**
	 * Scales the vector with a factor.
	 * 
	 * @param a
	 *            Scaling factor.
	 */
	public void scale(double a) {
		x *= a;
		y *= a;
		z *= a;
	}

	/**
	 * Calculates the L2 (euclidean norm) norm of this vector.
	 * 
	 * @return L2-Norm.
	 */
	public double getNorm() {
		// Question: what about
		// Math.sqrt(dot(this)) ?
		return Math.sqrt(x * x + y * y + z * z);
	}

	/**
	 * Calculates the dot product of this vector with another one.
	 * 
	 * @param v
	 *            Other vector.
	 * @return Dot product of this vector with the given one.
	 */
	public double dot(Vector v) {
		return x * v.x + y * v.y + z * v.z;
	}

	/**
	 * Scales the vector to the euclidean length 1.
	 */
	public void normalise() {
		// What could happen here?
		scale(1.0 / getNorm());
	}

	/**
	 * Returns a string representation of this vector.
	 * 
	 * @return String representation of this vector.
	 */
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	// ////////////////
	// Setter methods
	// ////////////////

	/**
	 * Sets the x component.
	 * 
	 * @param x
	 *            new value of the x component.
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Sets the y component.
	 * 
	 * @param y
	 *            new value of the y component.
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Sets the z component.
	 * 
	 * @param z
	 *            new value of the z component.
	 */
	public void setZ(double z) {
		this.z = z;
	}

	// ////////////////
	// Getter methods
	// ////////////////
	/**
	 * Returns the x component.
	 * 
	 * @return x component of this vector.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Returns the y component.
	 * 
	 * @return y component of this vector.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Returns the z component.
	 * 
	 * @return z component of this vector.
	 */
	public double getZ() {
		return z;
	}
}
