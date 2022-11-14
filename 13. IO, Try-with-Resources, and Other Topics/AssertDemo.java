// demonstrate assert.
/*
class AssertDemo
{
	static int val = 3;

	// return an integer.
	static int getnum()
	{
		return val--;
	}

	public static void main(String args[])
	{
		int n;

		for(int i = 0; i < 10; i++)
		{
			n = getnum();

			assert n > 0;	// will fail when n is 0

			System.out.println("n is " + n);
		}
	}
}
*/

// A poor way to use assert !!!

class AssertDemo
{
	// get a random number generator 
	static int val = 3;

	// return an integer. 
	static int getnum()
	{
		return val--;
	}

	public static void main(String[] args)
	{
		int n = 0;

		for(int i = 0; i < 10; i++)
		{
			assert (n = getnum()) > 0;	// this is not a good idea!

			System.out.println("n is " + n);
		}
	}
}