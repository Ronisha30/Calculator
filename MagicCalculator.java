//declares a magicCalculator class that is a child of Calculator
public class MagicCalculator extends Calculator{
	//declares the square root method and returns the answer for the given number
	public static double squareRoot(int number)
	{
		return Math.sqrt(number);
	}
	//declares the sin method and returns the answer for the given number
	public static double sin(int number)
	{
		return Math.sin(number);
	}
	//declares the cosine method and returns the answer for the given number
	public static double cosine(int number)
	{
		return Math.cos(number);
	}
	//declares the tangent method and returns the answer for the given number
	public static double tangent(int number)
	{
		return Math.tan(number);
	}
	//declares the factorial method and returns the answer for the given number
	public static double factorial(int number)
	{
		//checks whether the number is less or equal to one and returns one to the factorial method
		if(number <= 1)
		{
			return 1;
		}else
		{
			//multiplies the number with the factorial of the previous number and its done recursively
			return (number * factorial(number-1));
		} 
	}
}
