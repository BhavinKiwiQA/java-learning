
public class MainClasss {

	public static void main(String[] args) {
        //Calculation shape;
		Calculation rect = new Rectangle();
        //shape = rect;

        rect.setValues(78, 5);

        System.out.println("Area of rectangle : " + rect.getArea());

        Calculation tri = new Triangle();


        //shape = tri;


        tri.setValues(34,3);
        System.out.println("Area of triangle : " + tri.getArea());
    }
		

	}

