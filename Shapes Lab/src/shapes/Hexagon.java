package shapes;

public class Hexagon implements Shape {
	// fields
		private int side;

		/**
		 * Constructor method
		 * 
		 * @param radius
		 */
		public Hexagon(int side) {
			this.side = side;
		}

		@Override
		public double calculateArea() {
			double area = (3 * java.lang.Math.sqrt(3) * side * side) / 2;
			return area;
		}

		@Override
		public double calculatePerimeter() {
			double perimeter = side * 6;
			return perimeter;
		}

		@Override
		public String toString() {
			return "Hexagon side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
					+ this.calculatePerimeter();
		}
}
