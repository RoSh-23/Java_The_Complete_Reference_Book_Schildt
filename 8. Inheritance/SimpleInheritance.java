// a simple example of inheritance.

// create a superclass.
class A
{
	int i, j;

	void showij()
	{
		System.out.println("i and j: " + i + " " + j);
	}
}

// create a subclass by extending class A.
class B extends A
{
	int k;

	void showk()
	{
		System.out.println("k: " + k);
	}

	void sum()
	{
		System.out.println("i + j + k: " + (i + j + k));
	}
}

class SimpleInheritance
{
	public static void main(String[] args)
	{
		A superOb = new A();
		B subOb = new B();

		// the superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of subOb: ");
		superOb.showij();
		System.out.println();

		/* the subclass has access to all public members of 
		   its superclass. */
		subOb.i = 7;;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();
		subOb.showk();
		System.out.println();

		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
	}
}