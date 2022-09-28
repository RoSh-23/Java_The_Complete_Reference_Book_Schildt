// another version of IntStack that has a private interface 
// method that is used by two default methods.
interface IntStack2
{
	void push(int item);	// store an item
	int pop();	// retrive an item

	// a default method that returns an array that contains 
	// the top n elements on the stack.
	default int[] popNElements(int n)
	{
		// return the requested elements.
		return getElements(n);
	}

	// a default method that returns an array that contains 
	// the next n elements on the stack sfter skippking elements.
	default int[] skipAndPopNElements(int skip, int n)
	{
		// Skip the specified number of elements.
		getElements(skip);

		// return the requested elements.
		return getElements(n);
	}

	// a private method that returns an array containing 
	// the top n elements on the stack
	private int[] getElements(int n)
	{
		int[] elements = new int[n];

		for(int i = 0; i < n; i++)
			elements[i] = pop();

		return elements;
	}
}