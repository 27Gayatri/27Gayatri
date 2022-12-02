package lang.java;

public class Overloding{
	

		// TODO Auto-generated method stub
		
  void display(int a,int b)
  {

			int c=a+b;
			System.out.println("sum of a+b" + c);
		
		}
void display()
		{
		System.out.println("Hello");	
		}
	public static void main(String[] args)

	{
	Overloding over=new Overloding();
	over.display(10,20);
		over.display();
}
}

