//Write a Program to display all the armstrong number from 100 to 500?
	public class ArmstrongNumber
	{
	    public static void main(String[] args) 
	     {
	        int n, count = 0, a, b, c, sum = 0;
	        System.out.print("Armstrong numbers from 100 to 500:");
	        for(int i = 100; i <= 500; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum = 0;
	        }
	    }
	}
	


