
public interface Calculator {
	public abstract double Add(double a, double b);
	public abstract double Subtract(double a, double b);
	public abstract double Multiply(double a, double b);
	public abstract double Divide(double a, double b);
	public abstract double Remainder(double a, double b);
	public abstract double Square(double a);
	
	public abstract double Average(double[] a);
	public abstract String Compare(double a, double b);
}
