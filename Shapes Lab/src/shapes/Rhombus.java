package shapes;

public class Rhombus implements Shape{
	// fields
			private int base;
			private int height;

			/**
			 * Constructor method
			 * 
			 * @param radius
			 */
			public Rhombus(int base, int height) {
				this.base = base;
				this.height = height;
			}

			@Override
			public double calculateArea() {
				double area = base * height;
				return area;
			}

			@Override
			public double calculatePerimeter() {
				double perimeter = base * 4;
				return perimeter;
			}

			@Override
			public String toString() {
				return "Rhombus base: " + base + " height: " + height +" Area: " + this.calculateArea() + " Perimeter: "
						+ this.calculatePerimeter();
		}
}
