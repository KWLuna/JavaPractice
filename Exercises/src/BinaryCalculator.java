
public class BinaryCalculator implements Calculator 
{
	NumberCalculator numbCalc = new NumberCalculator();
	public String DecimalToBinary(int a)
	{
		return Integer.toBinaryString(a);
	}
	public String DecimalToHex(int a)
	{
		return Integer.toHexString(a);
	}
	public String DecimalToOctal(int a)
	{
		return Integer.toOctalString(a);
	}

	public int HexToDecimal(String a)
	{
		return Integer.parseInt(a, 16);
	}
	public String HexToBinary(String a)
	{
		// Convert to Decimal then convert to binary
		return DecimalToBinary(HexToDecimal(a));
	}
	public String HexToOctal(String a)
	{
		return BinaryToOctal(HexToBinary(a));
	}
	
	public int OctalToDecimal(String a)
	{
		return Integer.parseInt(a, 8);
	}
	public String OctalToBinary(String a)
	{
		//		Convert Octal to Decimal
		//		Decimal to Binary
		return DecimalToBinary(OctalToDecimal(a));
	}
	public String OctalToHex(String a)
	{
		// Convert Octal to Binary to Hexa
		return BinaryToHex(OctalToBinary(a));
	}
	public int BinaryToDecimal(String a)
	{
		return Integer.parseInt(a, 2); 
	}
	public String BinaryToHex(String a)
	{
		return Integer.toHexString(BinaryToDecimal(a));
	}
	public String BinaryToOctal(String a)
	{
		//		Convert binary to decimal
		//		convert decimal to octal
		return DecimalToOctal(BinaryToDecimal(a));
	}
	
	@Override
	public double Add(double a, double b) {
		int a1 = BinaryToDecimal(Integer.toString((int)a));
		int b1 = BinaryToDecimal(Integer.toString((int)b));
		return Double.parseDouble(DecimalToBinary((int)numbCalc.Add(a1, b1)));
	}

	@Override
	public double Subtract(double a, double b) {
		int a1 = BinaryToDecimal(Double.toString(a));
		int b1 = BinaryToDecimal(Double.toString(b));
		
		return Double.parseDouble(DecimalToBinary((int)numbCalc.Subtract(a1, b1)));
	}

	@Override
	public double Multiply(double a, double b) {
		int a1 = BinaryToDecimal(Double.toString((int)a));
		int b1 = BinaryToDecimal(Double.toString(b));
		
		return Double. parseDouble(DecimalToBinary((int)numbCalc.Multiply(a1, b1)));
	}

	@Override
	public double Divide(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double Remainder(double a, double b) {
		int a1 = BinaryToDecimal(Double.toString(a));
		int b1 = BinaryToDecimal(Double.toString(b));
		
		return Double. parseDouble(DecimalToBinary((int)numbCalc.Remainder(a1, b1)));
	}

	@Override
	public double Square(double a) {
		int a1 = BinaryToDecimal(Double.toString(a));
		
		return Double. parseDouble(DecimalToBinary((int)numbCalc.Square(a1)));
	}

	@Override
	public double Average(double[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String Compare(double a, double b) {
		// TODO Auto-generated method stub
		return null;
	}

}
