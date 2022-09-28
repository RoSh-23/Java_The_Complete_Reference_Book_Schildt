// Implement MyIF
class MyIFImp implements MyIF 
{
	// only getNumber() defined by MyIF need to be implemented.
	// getString() can be allowed to default.
	public int getNumber()
	{
		return 100;
	}
}

class MyIFImp2 implements MyIF
{
	// here, implementations for both getNumber() and getString() are provided.
	public int getNumber()
	{
		return 100;
	}

	public String getString()
	{
		return "This is a different string.";
	}
}

// use the default method.
class DefaultMethodDemo
{
	public static void main(String[] args)
	{
		MyIFImp obj = new MyIFImp();

		// can call getNumber(), because it is explicitly 
		// implemented by MyIFImp:
		System.out.println(obj.getNumber());

		// can also call getString(), because of default
		// implementation:
		System.out.println(obj.getString());
	}
}