public interface MyIF 
{
	// this is a "normal" interface method declaration.
	// it does not define a default implementation.
	int getNumber();

	// This is a default method. Notice that it provides 
	// a default implementation.
	default String getString()
	{
		return "Default String";
	}
}
