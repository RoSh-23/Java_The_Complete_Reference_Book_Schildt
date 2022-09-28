public interface MyIF2 
{
	// this is a "normal" interface method declaration.
	// it does not define a default implementation.
	int getNumber();

	// this is a default method. Notice that it provides 
	// a default implementation.
	default String getString()
	{
		return "Default String";
	}

	// this is a static interface method.
	static int getDefaultNumber()
	{
		return 0;
	}
}

