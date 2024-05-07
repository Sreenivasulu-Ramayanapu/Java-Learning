package Java.designpatterns;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String Shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color == "Red") {
			return new Red();
		} else if (color == "Blue") {
			return new Blue();
		} else if (color == "Green") {
			return new Green();
		}
		return null;
	}

}
