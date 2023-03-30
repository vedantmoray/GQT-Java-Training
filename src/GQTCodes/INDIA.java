package GQTCodes;
import java.util.Scanner;
public class INDIA
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n =sc.nextInt();
		//logic for I
		for(int i=0; i<=n-1;i++)
		{
			for(int j=0; j<=n-1;j++)
			{
				if(i==0 && j<=(n-1) || j==n/2 || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				
				}
			}
			System.out.print("   ");
		//logic for love
		for(int j=0; j<=n-1;j++)
			{
				if(i-j==n/2 || i+j==((n-1)+n/2) || 
				   j==0 && i<=n/2 && i!=0 || 
				   j==n-1 && i<=n/2 && i!=0 || 
				   i+j==n-1 && i<=n/2 || i==j && i<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				
				}
			}
			System.out.print("   ");
		//logic for I
					for(int j=0; j<=n-1;j++)
					{
						if(i==0 && j<=(n-1) || j==n/2 || i==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						
						}
					}
			System.out.print("   ");
				//logic for N
				
					for(int j=0; j<=n-1;j++)
					{
						if(j==0 || i==j || j==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						
						}
					}
			System.out.print("   ");	
				//logic for D
					for(int j=0; j<=n-1;j++)
					{
						if(i==0 || j==0 || i==n-1  || j==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						
						}
					}
			System.out.print("   ");		
				//logic for I
					for(int j=0; j<=n-1;j++)
					{
						if(i==0 && j<=(n-1) || j==n/2 || i==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						
						}
					}
			System.out.print("   ");
				//logic for A
					for(int j=0; j<=n-1;j++)
					{
						if(j==0 || i==0 && j<=n-1 || j==n-1 || i==n/2 && j<=n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						
						}
					}
					System.out.println();
				}
	}
}
