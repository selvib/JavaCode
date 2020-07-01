package browser;

public class Diamond_For {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
		 
		{
		System.out.print(" ");
		}
		 
			for(int j=1;j<=i*2-1;j++)
		 
		{
		System.out.print(j);
		}
		System.out.println();
		 
		} 
			for(int i=4-1;i>0;i--)
		{
				for(int j=1;j<=4-i;j++)
		 
		{
		System.out.print(" ");
		}
				for(int j=1;j<=i*2-1;j++)
		 
		{
		System.out.print(j);
		}
		System.out.println();
		}

	}

}
