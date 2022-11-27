/*
// Stats attempts (unsuccessfully) to 
// create a generic class that can compute 
// the average of an array of numbers of 
// any given type.

// The class contains an error!
class Stats<T>
{
	T[] nums;	// nums is an array of type T

	// pass the constructor a reference to 
	// an array of type T.
	Stats(T[] o)
	{
		nums = o;
	}

	// return type double in all cases.
	double average()
	{
		double sum = 0.0;
		for(int i = 0; i < nums.length; i++)
			sum  += nums[i].doubleValue();	// Error!!!

		return sum / nums.length;
	}
}
*/

// in this version of Stats, the type argument for
// T must be either Number, or a class derived 
// from Number.
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
}

// demonstrate Stats.
class BoundsDemo
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

		// this won't compile because String is not a 
		// subclass of Number.
		// String strs = {"1", "2", "3", "4", "5"};
		// Stats<String> strob = new Stats<String>(strs);
		// double x = strob.average();
		// System.out.println("strob average is " + x);
	}
}