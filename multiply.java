/*
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/


class multi
{
	public static void main(String [] args)
	{
		int k1,k2,k3,add,sum1 = 0, sum2 = 0, sum3 = 0;
		for (k1=1;k1<=333;k1++) sum1 += 3 * k1;
			{
				System.out.println("" +sum1);
			}
		for (k2=1;k2<=199;k2++) sum2 += 5* k2;
			{
				System.out.println("" +sum2);
			}
		for (k3=1;k3<=66;k3++) sum3 += 15 * k3;
			{
				System.out.println("" +sum3);
			}
		add = (sum1+sum2) - sum3;
		System.out.println("the value is:" +add);

	}
}
