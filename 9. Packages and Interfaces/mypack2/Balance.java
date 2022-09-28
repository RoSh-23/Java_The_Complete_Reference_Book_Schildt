package mypack2;

/*
	Now, the Balance class, its constructor, and its
	show() method are public. This means that they can
	be used by non-sublclass code outside their package. 
*/
public class Balance
{
	String name;
	double bal;

	public Balance(String n, double b)
	{
		name = n;
		bal = b;
	}

	public void show()
	{
		if(bal < 0)
			System.out.print("--> ");
		System.out.println(name + ": $" + bal);	
	}
}