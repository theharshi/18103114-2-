import java.util.*;
public class q2
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	System.out.println("Enter the elements");
	
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	
    int count[]=new int[100005];	//  count is the frequency array of each element
	for(int i=0;i<21;i++)
		count[i]=0;
	
	for(int i=0;i<n;i++)
	{
		count[a[i]]++;
	}
//	for(int i=0;i<=20;i++)
//	System.out.print(count[i]+"____");
	int i=0,index=0;
	while(i<n && index<21)
	{
		while(index<21 && count[index]<=0)
		index++;
		if(index==21)break;
		a[i++]=index;
		count[index]--;
	}
	
	for(i=0;i<n;i++)
	System.out.print(a[i]+" ");
	}
}
