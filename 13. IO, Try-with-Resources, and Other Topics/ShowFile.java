/* 	display a text file.
	to use this program, specify the name 
	of the file that you want to see.
	For example, to see a file called TEST.TXT,
	use the following commad line.

	java ShowFile TEST.TXT 
*/

/*
import java.io.*;

class ShowFile
{
	public static void main(String[] args)
	{
		int i;
		FileInputStream fin;

		// first, confirm that a filename has been specified. 
		if(args.length != 1)
		{
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// attemp to open the file.
		try
		{
			fin = new FileInputStream(args[0]);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot Open File");
			return;
		}

		// at this point, the file is open and can be read.
		// the following reads characters until EOF is encountered.
		try
		{
			do
			{
				i = fin.read();
				if(i != -1)
					System.out.print((char) i);
			} while(i != -1);
		} catch(IOException e)
		{
			System.out.println("Error Reading File");
		}

		// Close the file.
		try
		{
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("Error Closing File");
		}
	}
}

*/

/* 	display a text file.
	to use this program, specify the name 
	of the file that you want to see.
	For example, to see a file called TEST.TXT,
	use the following commad line.

	java ShowFile TEST.TXT

	This variation wraps the code that opens and 
	accesses the file within a single try block.
	this file is closed by the finally block. 
*/
/*
import java.io.*;

class ShowFile
{
	public static void main(String[] args)
	{
		int i;
		FileInputStream fin = null;

		// first, confirm that a filename has been specified. 
		if(args.length != 1)
		{
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// the following code opens a file, reads characters until EOF 
		// is encountered, and then closes the file via a finaally block.
		try
		{
			fin = new FileInputStream(args[0]);

			do
			{
				i = fin.read();
				if(i != -1)
					System.out.print((char) i);
			} while(i != -1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found.");
		}
		catch(IOException e)
		{
			System.out.println("An I/O Error Occurred");
		}
		finally
		{
			// close file in all cases.
			try 
			{
				if(fin != null)
					fin.close();
			}
			catch(IOException e)
			{
				System.out.println("Error Closing File");
			}
		}
	}
}
*/

/* 	This version of the ShowFile program uses a tr-with-resources 
	statement to automatically close a file after it is no longer 
	needed.
*/

import java.io.*;

class ShowFile
{
	public static void main(String[] args)
	{
		int i;

		// First, confirm that a filename has been specified.
		if(args.length != 1)
		{
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// the following code uses a try-with-resources statement to open 
		// a file and then automatically close it when the try block is left.
		try(FileInputStream fin = new FileInputStream(args[0]))
		{
			do
			{
				i = fin.read();
				if(i != -1)
					System.out.print((char) i);
			} while(i != -1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found.");
		}
		catch(IOException e)
		{
			System.out.println("An I/O Error Occurred");
		}
	}
}