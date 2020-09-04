import java.util.*;
public class q4 {

public static void main(String[] args) {
		long n=Integer.MAX_VALUE;
		long s=0;
		for(long i=n;i>=1;i--)
		{
			s=i*i;
			long t=(i*(i+1))/2;
			if(s==t)
			{System.out.println(i);break;}
		}
		
	}
}