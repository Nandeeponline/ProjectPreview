package java_projects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hex_to_rgbCode {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Hex color Code (With or Without hash tag, as you wish) :");
		String h=ob.readLine();
		h=h.toUpperCase();
		if(h.charAt(0)=='#')
			h=h.substring(1, h.length());
		if(Valid(h))
		{
		int c[]=new int[3];
		int i;
		for(i=0;i<6;i++)
		{
			if(i%2!=0)
			{
				c[i/2]=conv(h.substring(i-1, i+1));
				if(c[i/2]<0)
				{
					i=20;
					System.out.println("Invalid Input");
					break;
				}
			}
		}
		if(i!=20)
		System.out.println("R="+c[0]+", G="+c[1]+", B="+c[2]);
		}
		else
			System.out.println("Invalid Input, length of the hex code should be either 6(without hash tag) or 7(with hash tag).");
	}
	public static boolean Valid(String h)
	{
		if(h.length()!=6)
			return false;
		else
			return true;
		
	}
	public static int conv(String h) {
		int z;
		z=chk(h.charAt(0))*16+chk(h.charAt(1));
		return z;
	}
	public static int chk(char ch)
	{
		if(ch>47&&ch<58)
			return ch-48;
		else if(ch>64&&ch<71)
			return ch-55;
		else
			return -1000;
	}

}
