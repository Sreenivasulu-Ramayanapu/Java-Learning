package Java.designpatterns;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shape) {
		if(shape == null) {
			return null;
		}
		if(shape == "Circle") {
			return new Circle();
		}else if(shape == "Rectangle") {
			return new Rectangle();
		}else if(shape == "Square") {
			return new Square();
		}
		
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
