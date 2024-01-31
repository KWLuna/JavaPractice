import java.util.Arrays;

public class NumberCalculator implements Calculator {
	public double Add(double a, double b)
	{
		return a + b;
	}
	public double Subtract(double a, double b)
	{
		return a - b;
	}
	public double Multiply(double a, double b) 
	{
		return a * b;
	}
	
	public double Divide(double a, double b)
	{
		return a / b;
	}
	public double Remainder(double a, double b)
	{
		return a % b;
	}
	public double Square(double a)
	{
		return Multiply(a, a);
	}
	public double SqrRoot(double a)
	{
		return Math.sqrt(a);
	}
	public double Average(double[] a)
	{
		double total = 0;
		for(int i = 0; i < a.length; ++i)
		{
			total += a[i];
		}
		return Divide(total, a.length);
	}
	
	public String Compare(double a, double b)
	{
		if(a > b)
			return a + " > " + b;
		else if (a < b)
			return a + " < " + b;
		else if (a == b)
			return a + " = " + b;
			
		return "NULL";
	}

	public double DistanceOfPoints(double[] a, double[] b)
	{
		double x = Multiply(Subtract(b[0], a[0]), Subtract(b[0], a[0]));
		double y = Multiply(Subtract(b[0], a[1]), Subtract(b[1], a[1]));
		double result = Add(x, y);
		return Math.sqrt(result);
	}
	
	public int IsEven(double a)
	{
		if (a % 2 == 0)
			return 1;
		else
			return 0;
	}
	
	public String IsPowerOf4(int a)
	{
		//	Cannot be negative number as u cannot sqrt negative number
		double d = (Math.log(a) / Math.log(4));  
		  
		boolean isPow = Math.ceil(d) == Math.floor(d);  
		
		if (isPow)
			return a + " is a Power of 4";
		else
			return a + " is not Power of 4";
	}
	public String PrintArray(double[] a) 
	{
		String arrayString = "";
		for (int i = 0; i < a.length; ++i)
		{
			arrayString += a[i];
			if(i + 1 != a.length)
				arrayString += ", ";
		}
		return arrayString;
	}
	public String Median(double[] a)
	{
//		a is unsorted array
//		Sort array first?
		Arrays.sort(a);
//		If length is odd, Median is the middle point
		double median = 0;
		double midPoint = a.length / 2;

		if(a.length % 2 == 1)
		{
			median = a[(int)midPoint];
		}
//		If length is even, Median is average of the two middle data point
		else if(a.length % 2 == 0)
		{
			median = Divide(Add(a[(int)midPoint], a[(int)midPoint - 1]), 2);
		}
		
		return median  + " is the Median Number in array [" + PrintArray(a) + ']';
	}
}
