/* 	Copy a file.
	To use this program, specify the name
	of the source file and the destination file.
	For example, to copy a file called FIRST.TXT to a file called SECOND.TXT, use the following command line.

	java CopyFile FIRST.TXT SECOND.TXT
*/
/*
import java.io.*;

class CopyFile
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		// First, confirm that both files have been specified.
		if(args.length != 2)
		{
			System.out.println("Usage: CopyFile from to");
			return;
		}

		// Copy a File.
		try
		{
			// attempt to open the files.
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do
			{
				i = fin.read();
				if(i != -1)
					fout.write(i);
			} while(i != -1);
		}
		catch(IOException e)
		{
			System.out.println("I/O Error: " + e);
		}
		finally 
		{
			try
			{
				if(fin != null)
					fin.close();
			}
			catch(IOException e2)
			{
				System.out.println("Error Closing Input File");
			}
			try
			{
				if(fout != null)
					fout.close();
			}
			catch(IOException e2)
			{
				System.out.println("Error Closing Output File");
			}
		}
	}
}	

*/
/* 	A version of CopyFile that uses try-with-resources.
	It demonstrates two resources (in this case files) being 
	managed by a single try statement.
*/

import java.io.*;

class CopyFile
{
	public static void main(String[] args) throws IOException
	{
		int i;
		// First, confirm that both files have been specified.
		if(args.length != 2)
		{
			System.out.println("Usage: CopyFile from to");
			return;
		}

		// Open and manage two files via the try statement.
		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]))
			{
				do
				{
					i = fin.read();
					if(i != -1)
						fout.write(i);
				} while(i != -1);
			}catch(IOException e)
			{
				System.out.println("I/O Error: " + e);
			}
	}
}