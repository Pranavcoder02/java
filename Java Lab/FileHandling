import java.io.*;
import java.util.Scanner;
class CreateFile
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		File f = new File("d:\\jdk\\abc1.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("Successfully file is Created");
			}
			else
			{
				System.out.println("file is already exits");
			}

			try(FileWriter w=new FileWriter(f))
			{
			if(f.canWrite())
			{
			   
			   System.out.println("Write into file :");
			   String s=sc.next();
			   w.write(s);
			   System.out.println("Successsfully Written into File");
			}
			
			else
			{
			   System.out.println("File is already Written");
			}
			}
			catch(IOException e)
			{
			System.out.println(e);
			}

			if(f.canRead())
			{
			   System.out.println("File is Readable");
			}
			else
			{
			   System.out.println("File is already Readable");
			}

			
			if(f.delete())
			{
				System.out.println("Successfully file is deleted");
			}
			else
			{
				System.out.println("file is already deleted");
			}



		}
		catch(IOException i)
		{
			System.out.println("Exception is Handled");
		}

	}
}
