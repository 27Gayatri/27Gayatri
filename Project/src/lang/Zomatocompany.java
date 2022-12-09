package lang;

 interface Zomatocompany
			{
				abstract void menu();
				abstract void orderonline();
				abstract void delivery();
			}
			class Mauj implements Zomatocompany
			{
				public void menu()
				{
					System.out.println("north indian");
					System.out.println("southindian");
					System.out.println("chinese");
				}
				public void orderonline()
				{
					System.out.println("recieve by zomato");
					System.out.println("issue the order by mauj chef");
					System.out.println("mauj chef will prepare acc to their recepie");
				}
				public void delivery() {
					// TODO Auto-generated method stub
					System.out.println("maharastrian");
					System.out.println("kandal");
					
				}
				
			    public static void main(String[] args) {
				// TODO Auto-generated method stub
		          Mauj m1 =new Mauj();
		          m1.delivery();

		          
			}

		}
