import java.util.Scanner;


public class Exercise { 
    
    public static void print(String msg)
    {
        System.out.println(msg);
    }
    
    public static void print(int msg)
    {
    	System.out.println(msg);
    }
    
    public static void print(double msg)
    {
    	System.out.println(msg);
    }
    
    public static int getInput(Scanner scanner, String msg)
    {
    	int inputResult = 0;
    	do {
            print("Input " + msg + " number");
            while (!scanner.hasNextInt()) {
                print("Input " + msg + " number");
                scanner.next();
            }
            inputResult = scanner.nextInt();
        } while(inputResult == 0);
		return inputResult;
    }
    
    public static void main(String[] args) 
    {
//    	https://www.w3resource.com/java-exercises/basic/index.php
    	
    	NumberCalculator numCalc = new NumberCalculator();
    	BinaryCalculator binaryCalc = new BinaryCalculator();
    	ShapeCalculator shapeCalc = new ShapeCalculator();
    	StringManager stringManager = new StringManager();
    	
        print("----\nExercise 1");
        print("Hello\nAlexandra Abramov!");
      
        print("----\nExercise 2");
        print(numCalc.Add(74, 36));

        print("----\nExercise 3");
        print(numCalc.Divide(50,3));
        
        print("----\nExercise 4");
        int d = -5 + 8 * 6;
        int e = (55 + 9) % 9;
        int f = 20 + -3 * 5 / 8;
        int g = 5 + 15 / 3 * 2 - 8 % 3;
        print(d);
        print(e);
        print(f);
        print(g);
        
        print("----\nExercise 5");
        Scanner scanner = new Scanner(System.in);
        
        double input1 = 0, input2 = 0;
//        input1 = getInput(scanner, "first");
//        input2 = getInput(scanner, "second");
        input1 = 25;
        input2 = 5;

        print(numCalc.Multiply(input1, input2));
        
        print("----\nExercise 6");
//        input1 = getInput(scanner, "first");
//        input2 = getInput(scanner, "second");
        input1 = 125;
        input2 = 24;

        print(numCalc.Add(input1, input2));
        print(numCalc.Subtract(input1, input2));
        print(numCalc.Multiply(input1, input2));
        print(numCalc.Divide(input1, input2));
        print(numCalc.Remainder(input1, input2));

        print("----\nExercise 7 - Multiplication Table");
//        input1 = getInput(scanner, "a");
        input2 = 3;
        
//        Multiplication Table
        for (int i = 1; i <= 10; ++i)
        {
            print(input1 + " x " + i + " = " + numCalc.Multiply(input1, i));
        }
        
        print("----\nExercise 9");
        double numerator = numCalc.Subtract( numCalc.Multiply(25.5, 3.5) , numCalc.Multiply(3.5, 3.5) );
        double denominator = numCalc.Subtract(40.5, 4.5);
        print(numCalc.Divide(numerator, denominator));

        print("----\nExercise 11 - Perimeter and Area of Circle");
        double radius = 7.5;
        print("Perimeter: " + shapeCalc.PerimeterOfCircle(radius));
        print("Area: " + shapeCalc.AreaOfCircle(radius));
        
        print("----\nExercise 12 - Average of numbers");
        double[] numbers = {2, 10, 6};
        print(numCalc.Average(numbers));

        print("----\nExercise 13 - Perimeter and Area of Rectangle");
        double length = 5.6;
        double width = 8.5;
        print("Perimeter: " + shapeCalc.PerimeterOfRectangle(length, width));
        print("Area: " + shapeCalc.AreaOfRectangle(length, width));
        
        print("----\nExercise 15 - Swap Variables");
        double x = 10;
        double y = 5;
        double tmp;
        tmp = x;
        x = y;
        y = tmp;
        print("x = " + x);
        print("y = " + y);
      
        print("----\nExercise 16 - Adding Binaries");
        print(binaryCalc.Add(10, 11));

        print("----\nExercise 21 - Decimal To Octal");
        print(binaryCalc.DecimalToOctal(15));
        
        print("----\nExercise 23 - Binary To Hex");
        print(binaryCalc.BinaryToHex("1101"));
        
        print("----\nExercise 24 - Binary To Hex");
        print(binaryCalc.BinaryToHex("111"));

        print("----\nExercise 25 - Octal to Decimal");
        print(binaryCalc.OctalToDecimal("10"));
        
        print("----\nExercise 26 - Octal to Binary");
        print(binaryCalc.OctalToBinary("7"));

        print("----\nExercise 27 - Octal to Hexa");
        print(binaryCalc.OctalToHex("100"));
        
        print("----\nExercise 28 - Hex to Decimal");
        print(binaryCalc.HexToDecimal("25"));

        print("----\nExercise 29 - Hex to Binary");
        print(binaryCalc.HexToBinary("37"));
        
        print("----\nExercise 30 - Hex to Octal");
        print(binaryCalc.HexToOctal("40"));
        
        print("----\nExercise 31 - Compare");
        print(numCalc.Compare(25, 39));
        
        print("----\nExercise 36 - Distance");
        double[] x1 = {25, 35};
        double[] y1 = {35.5, 25.5};
        print(numCalc.DistanceOfPoints(x1, y1));
        
        print("----\nExercise 37 - Reverse String");
        String s = "The quick brown fox";
        print(stringManager.ReverseString(s));
        
        print("----\nExercise 38 - Count Characters");
        s = "I am Luna 123 %";
        int[] charCount = stringManager.CountCharacters(s);
        print("Letter: "+ charCount[0] + "\nSpace:" + charCount[1] + 
        		"\nNumber: " + charCount[2] + "\nOther: " + charCount[3]);

        print("----\nExercise 41 - Character Value");
        print(stringManager.CharacterValue('L'));

        print("----\nExercise 47 - Current Date");
        // Method 1        
        DateCalculator dateCalc = new DateCalculator();
        print(dateCalc.Method1());
        // Method 2
        print(dateCalc.Method2());

        print("----\nExercise 49 - Check Even or Odd");
        print(numCalc.IsEven(2));
        print(numCalc.IsEven(4));

        print("----\nExercise 110 - Is Number Power of 4");
        print(numCalc.IsPowerOf4(64));
        print(numCalc.IsPowerOf4(1));
        print(numCalc.IsPowerOf4(6));
        
        print("----\nExercise 115 - Is String Palindrome");
        print(stringManager.IsPalindrome("mom"));
        print(stringManager.IsPalindrome("AWAY"));
        print(stringManager.IsPalindrome("151"));

        print("----\nExercise 128 - Median");
        double[] a = {10, 2, 38, 22, 28, 23};		// 2, 10, 22, 23, 28, 38 
        print("Unsorted Array: " + numCalc.PrintArray(a));
        print(numCalc.Median(a));
        double[] b = {10, 2, 38, 22, 28, 23, 21}; 	// 2, 10, 21, 22, 23, 28, 38 
        print("Unsorted Array: " + numCalc.PrintArray(b));
        print(numCalc.Median(b));
    }
}
