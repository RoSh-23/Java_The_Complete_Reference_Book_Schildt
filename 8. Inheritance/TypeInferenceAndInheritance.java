/*
	when working with inheritance, the inferred type is the declared type of the initializer, which may not be the most derived type of the object being referred to by the initializer.
*/

class MyClass
{
	// ...
}

class FirstDerivedClass extends MyClass
{
	int x;
	// ...
}

class SecondDerivedClass extends FirstDerivedClass
{
	int y;
	// ...
}

class TypeInferenceAndInheritance
{
	// return some type of MyClass object.
	static MyClass getObj(int which)
	{
		switch(which)
		{
			case 0: return new MyClass();
			case 1: return new FirstDerivedClass();
			default: return new SecondDerivedClass();
		}
	}

	public static void main(String[] args)
	{
		/*
			even though getObj() returns different types of objects within the MyClass inheritance hierarchy, its declared return type is MyClass. As a result, in all three cases shown here, the type of the variables is inferred to be MyClass, even though 
			different derived types of objects are obtained.
		*/

		// here, getObj() returns a MyClass object.
		var mc = getObj(0);

		// in this case a FirstDerivedClass object is returned.
		var mc2 = getObj(1);

		// here, a SecondDerivedClass object is returned.
		var mc3 = getObj(2);

		/*
			because the types of both mc2 and mc3 are inferred as MyClass (because the return type of getObj() is MyClass), neither mc2 nor mc3 can access the fields declared by FirstDerivedClass or SecondDerivedClass. 
		*/
		// mc2.x = 10; // Wrong! MyClass does not have an x field.
		// mc3.y = 10; 	// Wrong! MyClass does not have a y field.
	}
}
