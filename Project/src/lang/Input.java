package lang;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input {
		
		// TODO Auto-generated constructor stub
		public static void main(String args[]) throws NumberFormatException, IOException
		
		{
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("inter your loc and pin");
			int x=Integer.parseInt(bf.readLine());
			System.out.println("enter  pincode is"+x);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("inter your loc and pin");
		    float  y=Float.parseFloat(bf.readLine());
		    System.out.println("enter  pincode is"+x);
		}
		
		}
