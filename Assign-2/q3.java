import java.util.*;
public class q3
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String original = sc.next();
        int j=0;
        char temp=0;
        int index=0;
        char[] chars = original.toCharArray();
        for (int i = 0; i <chars.length-1; i++) {
            index=i;
            // finding the correct postion of element at index i and then swapping current and correct index
            for ( j = i+1; j < chars.length; j++) {
                if(chars[j]<chars[index]){
                    index=j;
                }
            }

            temp=chars[index];
            chars[index]=chars[i];
            chars[i]=temp;
        
        } 
        for(int k=0;k<chars.length;k++){
            System.out.print(chars[k]);
        }
    
    }

}