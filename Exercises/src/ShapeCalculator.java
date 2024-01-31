
public class ShapeCalculator {
	NumberCalculator numCalc = new NumberCalculator();
	private double Pi = 3.14159265;

	public double PerimeterOfCircle(double radius)
	{
		return numCalc.Multiply(numCalc.Multiply(2, radius), Pi);
	}
	public double AreaOfCircle(double radius)
	{
		return numCalc.Multiply(Pi, numCalc.Square(radius));
	}
	
	public double PerimeterOfRectangle(double length, double width)
	{
		return numCalc.Multiply(numCalc.Add(length, width), 2);
	}
	public double AreaOfRectangle(double length, double width)
	{
		return numCalc.Multiply(length, width);
	}
	
}
