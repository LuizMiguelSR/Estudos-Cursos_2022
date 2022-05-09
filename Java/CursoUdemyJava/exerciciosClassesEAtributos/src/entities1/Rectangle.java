package entities1;

public class Rectangle {
	public double Width;
	public double Height;
	
	public double Area() {
		return Width * Height;
	}
	
	public double Perimeter() {
		return 2 * (Width + Height);
	}
	
	public double Diagonal() {
		return Math.sqrt((Width * Width) + (Height * Height));
	}
	
}
