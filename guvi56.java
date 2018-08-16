import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s  =  "helloworld.123";

String numRegex   = ".*[0-9].*";
String alphaRegex = ".*[A-Z].*";

if (s.matches(numRegex) && s.matches(alphaRegex))
{
    System.out.println("valid" +s);
    }
    System.out.println("yes");

	}
}
