/**
 * 
 */
package metier;

/**
 * @author Stagiaire
 *
 */
public class Complex {
	private double im;
	private double re;
	
	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	@Override
	public String toString() {
		return "Complex [im = " + im + ", re = " + re + "]";
	}	
}
