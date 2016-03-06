import edu.princeton.cs.algs4.*;
import java.util.regex.*;

public class Email
{
	public static void main(String[] args)
	{
		Pattern pattern=Pattern.compile("");
		Matcher matcher=pattern.matcher("");
		
		while (matcher.find()) 
			StdOut.println(matcher.group(1));			
	}
}