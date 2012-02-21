/*
 * Complex.java - complex number class
 * Written for Software Design FS 12
 * by Rico Häuselmann, 20. 02. 2012
 */

package sd;

import java.lang.Math;

public class Complex
{
    private double real;
    private double img;

    public Complex(double real_, double img_) 
    {
        real = real_;
        img = img_;
    }

    public static Complex add(Complex first, Complex second) 
    {
        return new Complex(first.real + second.real, first.img + second.img);
    }

    public static Complex subtract(Complex first, Complex second) 
    {
        return new Complex(first.real - second.real, first.img - second.img);
    }

    public static Complex multiply(Complex first, Complex second) 
    {
        double resReal = first.real * second.real - first.img * second.img;
        double resImg = first.real * second.img + first.img * second.real;
        return new Complex(resReal, resImg);
    }

    public static Complex divide(Complex first, Complex second) 
    {
        double resReal = (first.real * second.real + first.img * second.img) / (second.real * second.real + second.img * second.img);
        double resImg = (first.img * second.real - first.real * second.img) / (second.real * second.real + second.img * second.img);
        return new Complex(resReal, resImg);
    }

    public Complex square() {
        double resReal = (this.real * this.real - this.img * this.img);
        double resImg = (this.real * this.img + this.real * this.img);
        return new Complex(resReal, resImg);
    }

    public double getArgument() 
    {
        if(this.real > 0 & this.img >= 0) {
            return  Math.atan(this.img / this.real);
        }
        else if(this.real > 0 & this.img < 0) {
            return  Math.atan(this.img / this.real) + 2 * Math.PI;
        }
        else if(this.real < 0) {
            return  Math.atan(this.img / this.real) + Math.PI;
        }
        else if(this.real == 0 & this.img > 0) {
            return  Math.PI / 2;
        }
        else if(this.real == 0 & this.img < 0) {   
            return  3 * Math.PI / 2;
        }
        else {
            return 0;
        }
    }
    
    public String toString()
    {
    	return this.real+" + "+this.img+"i";
    }

    public double getAbsolute() 
    {
        return Math.sqrt(this.real * this.real + this.img * this.img);
    }

    /**
     * Gets the real for this instance.
     *
     * @return The real.
     */
    public double getReal()
    {
        return this.real;
    }

    /**
     * Sets the real for this instance.
     *
     * @param real The real.
     */
    public void setReal(double real)
    {
        this.real = real;
    }

    /**
     * Sets the img for this instance.
     *
     * @param img The img.
     */
    public void setImg(double img)
    {
        this.img = img;
    }

    /**
     * Gets the img for this instance.
     *
     * @return The img.
     */
    public double getImg()
    {
        return this.img;
    }
}
