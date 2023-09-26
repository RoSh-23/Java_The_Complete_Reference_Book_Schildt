// A simple mailing list example.
import java.util.*;

class Address
{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;

	Address(String n, String s, String c, String st, String cd)
	{
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}

	public String toString()
	{
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}

class MailList
{
	public static void main(String[] args)
	{
		LinkedList<Address> ml = new LinkedList<Address>();

		// Add elements to the linked list.
		ml.add(new Address("Ramesh Parikh", "Sreeji Street", "Sambhajinagar", "Maharashtra", "42950"));
		ml.add(new Address("Rakhi Nagar", "Kalani Nagar", "Indore", "Madhya Pradesh", "43950"));
		ml.add(new Address("Ramji Lal", "Bank Street", "Chennai", "Tamil Nadu", "45678"));

		// Display the mailing list.
		for(Address element : ml)
			System.out.println(element + "\n");

		System.out.println();
	}
}