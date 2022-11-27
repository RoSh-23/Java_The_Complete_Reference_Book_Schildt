// a non-generic class can be the superclass 
// of a generic subclass.

// a non-generic class.
class NonGen
{
	int num;

	NonGen(int i)
	{
		num = i;
	}

	int getnum()
	{
		return num;
	}
}

// a generic subclass.
class Gen<T> extends NonGen
{
	T ob;	// declare an object of type T

	// Pass the constructor a reference to 
	// an objectr of type T.
	Gen(T o, int i)
	{
		super(i);
		ob = o;
	}

	// return ob.
	T getob()
	{
		return ob;
	}
}

// create a Gen object.
class HierDemo2
{
	public static void main(String[] args)
	{
		// create a Gen object for String.
		Gen<String> w = new Gen<String>("Hello", 47);

		System.out.print(w.getob() + " ");
		System.out.println(w.getnum());
	}
}