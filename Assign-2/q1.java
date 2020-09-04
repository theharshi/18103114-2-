import java.util.*;
public class q1
{
public static void main(String args[]){
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        s1=sc.next();
        s2=sc.next();
        
        int l1=s1.length(),l2=s2.length();
        int l=l1<l2? l1:l2;
        int ans=0;
        for(int i=0;i<l;i++)
        {
            if(s1.charAt(i)<s2.charAt(i))
            {ans=1;break;}
            else if(s1.charAt(i)>s2.charAt(i))
            {ans=2;break;}
        }
        if(ans==0){
            if(l1==l2) System.out.println("Equal");
            else if(l1<l2) System.out.println("First String smaller");
            else System.out.println("Second String smaller");
        }
        else{
            if(ans==1) System.out.println("First String smaller");
            else System.out.println("Second String smaller");
        }
	}
}