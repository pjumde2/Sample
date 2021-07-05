package Sel2020_1.Sel2020_1;

public class Test1 {

	public static void main(String[] args) {
		

		int d=1%3;
		System.out.println("d is:"+d);
		
		int sum=0;
		int a=3;
		while(sum++ < 3)
		{
			int b=(1 + 2*sum)%3;
			switch(b)
			{
				default:
				case 0:
					a-=1;
					break;
				case 1:
					a+=5;
					
			}
		}
		System.out.println(a);
	}

}
