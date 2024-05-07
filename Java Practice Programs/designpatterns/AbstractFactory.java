/**
 * 
 */
package Java.designpatterns;

/**
 * @author sramayanapu2
 *
 */
public abstract class AbstractFactory {

		abstract Shape getShape(String Shape);
		abstract Color getColor(String color);
}
