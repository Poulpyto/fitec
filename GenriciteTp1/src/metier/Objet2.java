/**
 * 
 */
package metier;

/**
 * @author Stagiaire
 *
 */
public class Objet2<T, X, Y> {
	private T x;
	private X y;
	private Y z;
	
	public Objet2(T x, X y, Y z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public X getY() {
		return y;
	}

	public void setY(X y) {
		this.y = y;
	}

	public Y getZ() {
		return z;
	}

	public void setZ(Y z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Objet2 []";
	}
	
}