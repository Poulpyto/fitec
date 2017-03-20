package presentation;
import metier.Carre;
import metier.Ellipse;
import metier.Rectangle;
import service.CarreService;
import service.RectangleService;

public class Lanceur {

	public static void main(String[] args) {
		
		Carre c = new Carre(10);
		//Rectangle r = new Rectangle(2, 4);
		//RectangleService rs = new RectangleService();
		CarreService cs = new CarreService();
		System.out.println(cs.perimetre(c));
		//RectangleService r = new RectangleService(10, 2);
		//EllipseService e = new EllipseService(2, 5);
		
		System.out.println(c);
		System.out.println(cs.coefficientEtalement(c));
		//System.out.println(r);
		//System.out.println(rs.surface(r));
		//System.out.println(e);
		//c.perimetre(c.getCote());
		//c.surface(c.getCote());
	}

}
