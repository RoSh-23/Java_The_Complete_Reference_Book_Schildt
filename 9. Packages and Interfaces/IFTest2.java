// implement a "growable" stack.
class DynStack implements IntStack
{
	private int stck[];
	private int tos;

	// allocate and initialize stack
	DynStack(int size)
	{
		stck = new int[size];
		tos = -1;
	}

	// push an item onto the stack
	public void push(int item)
	{
		// if stack is full, allocate a larger stack
		if(tos == stck.length - 1)
		{
			int temp[] = new int[stck.length * 2];	// double size 
			for(int i = 0; i < stck.length; i++)
				temp[i] = stck[i];
			stck = temp;	
			stck[++tos] = item;
		}
		else
			stck[++tos] = item;
	}

	// pop an item from the stack
	public int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else 
			return stck[tos--];
	}
}

class IFTest2
{
	public static void main(String[] args)
	{
		DynStack mystack1 = new DynStack(5);
		DynStack mystack2 = new DynStack(8);

		// push some numbers onto the stack
		for(int i = 0; i < 12; i++)
			mystack1.push(i);
		for(int i = 0; i < 20; i++)
			mystack2.push(i);

		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for(int i = 0; i < 12; i++)
			System.out.println(mystack1.pop());

		System.out.println("Stack in mystack2:");	
		for(int i = 0; i < 20; i++)
			System.out.println(mystack2.pop());
	}
}