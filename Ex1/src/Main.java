/*
 * Main.java - testing the complex number class
 * Written for Software Design FS 12
 * by Rico Häuselmann, 20. 02. 2012
 */

import sd.Complex;

public final class Main
{
    public static void main(final String[] args)
    {
        Complex a = new Complex(1, 0);
        System.out.println("a = "+a);
        Complex b = new Complex(0, 1);
        System.out.println("b = "+b);
        Complex c = Complex.add(a, b);
        System.out.println("a + b = c = "+c+"\n");
        System.out.println("Re(c) = "+c.getReal());
        System.out.println("Im(c) = "+c.getImg());
        System.out.println("|c| = "+c.getAbsolute());
        System.out.println("Arg(c) = "+c.getArgument());
    }
}
