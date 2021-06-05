import java.io.*;
public class Hex_Dec {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
		String s;
		long a=0,l,t;
		System.out.println("Enter the Hexadecimal number:");
		s=ob.readLine();
		s=s.toUpperCase();
		char c;
		l=s.length();
		for(int i=0;i<l;i++)
		{
			c= s.charAt(i);
			if(c<65)
				t=c-'0';
			else
				t=c-55;
			a=a+t*(long)Math.pow(16, l-i-1);
		}
System.out.println(s+" in decimal is "+a);
	}

}
