package util.scanner;

import java.io.InputStream;

public class Scanner {
	
	private String userName;
	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void  main(String args[]){ 
	{
		// TODO Auto-generated method stub
		Scanner myobj=new Scanner(System .in);
		System.out.println("Enter username");
		String userName =myobj.nextLine();
		System.out.println("username is :"+ userName );
	}}

	private String nextLine() {
		// TODO Auto-generated method stub
		return userName;
	}
}
