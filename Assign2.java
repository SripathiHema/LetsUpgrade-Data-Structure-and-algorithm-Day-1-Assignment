
public class Assign2 {

	public static void main(String[] args) {
		int n=27;
		for(int i=1;i<=n;i*=3)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("Hello\t");
			}
		}

	}

}

/*
  time complexity for 1st loop is log(n)
  time complexity for 2nd loop is n
  
  so total time complexity of the code is n*log(n)
  t(n)=n log(n)
  
*/
