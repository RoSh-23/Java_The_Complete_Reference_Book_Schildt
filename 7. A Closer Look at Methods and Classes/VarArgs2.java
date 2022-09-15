// use varargs with standard arguments.
class VarArgs2
{
	// here, msg is normal parameter and v is a 
	// varargs parameter.
	static void vaTest(String msg, int ... v)
	{
		System.out.print(msg + v.length + " Contents: ");

		for(int x : v)
			System.out.print(x + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		vaTest("One vararg: ", 10);
		vaTest("Three varargs: ", 1, 2, 3);
		vaTest("No varargs: ");
	}
}