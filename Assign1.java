
public class Assign1 {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("Hello\t");
			}
		}

	}

}
/* the first loop runs successfully n times
    
    time complexity for 1st loop will be t1=n
 
   the 2nd loop runs in the format n+(n-1)+(n-2)+....+1
   
  we know n(n-1)+(n-2)+....+1=n(n+1)/2
  => n2 (we consider highest power value)
  =>Time complexity for 2nd loop will be t2 =SquareRoot of n
  
   finally, Time Complexity Of the above code is
   T(n)=n*SquareRoot(n)
  
*/