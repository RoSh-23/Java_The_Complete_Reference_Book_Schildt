// use a wildcard.
class Stats<T extends Number>
{
	T[] nums;	// array of Number or subclass 

	// pass the constructor a reference to 
	// an array of type Number or subclass.
	Stats(T[] o)
	{
		nums = o;
	}

	// return type double in all cases. 
	double average()
	{
		double sum = 0.0;

		for(int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();

		return sum / nums.length;
	}

	// determine if two averages are the same.
	// notice the use of the wildcard.
	boolean sameAvg(Stats<?> ob)
	{
		if(average() == ob.average())
			return true;

		return false;
	}
} 

// demonstrate wildcard.
class WildcardDemo
{
	public static void main(String[] args)
	{
		Integer inums[] = {1, 2, 3, 4, 5};
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);

		Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is " + w);

		Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("fob average is " + x);

		// see which arrays have same average.
		System.out.print("Averages of iob and dob ");
		if(iob.sameAvg(dob))
			System.out.print("are the same.");
		else 
			System.out.println("differ.");

		System.out.print("Averages of iob and fob ");
		if(iob.sameAvg(fob))
			System.out.print("are the same.");
		else 
			System.out.println("differ.");
	}
}