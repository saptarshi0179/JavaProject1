import java.util.Scanner;

public class LongestIncreasingSubsequence
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n=scn.nextInt();
		
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
		System.out.print("Enter the "+i+"th index element : ");
			arr[i]=scn.nextInt();
		}
		
		int overallmax=0;
		int[] dp=new int[n];
		for(int i=0;i<n;i++)
		{
			int max=0;
			
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					if(dp[j]>max)
					{
						max=dp[j];
					}
				}
			}
			dp[i]=max+1;
			
			if(dp[i]>overallmax)
			{
				overallmax=dp[i];
			}
		}
		System.out.print("Length of Longest Increasing Subsequence : "+overallmax);
	}
}