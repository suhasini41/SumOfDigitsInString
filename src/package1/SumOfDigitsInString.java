package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfDigitsInString {

	private static int sumOfDigits(String s) {
		int sum =0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		return sum;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(sumOfDigits("aa1bc2d3"), 6);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(sumOfDigits("aa11b33"), 8);
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(sumOfDigits("Chocolate"), 0);
	}



}
