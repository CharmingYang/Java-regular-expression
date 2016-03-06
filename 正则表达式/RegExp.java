import edu.princeton.cs.algs4.*;
import java.util.regex.*;

public class RegExp
{
	public static void main(String[] args)
	{
		Pattern pattern=Pattern.compile("foo");
		Matcher matcher=pattern.matcher("foo");
		boolean found=false;

		while(matcher.find())
		{
			StdOut.print(matcher.group()+" "+matcher.start()+" "+matcher.end()+"\n");
			found=true;
		}
		
		if(!found) StdOut.print("no match");
	}
}