import java.util.*;
public class Search_key{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("n:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("k:");
        int k=sc.nextInt();
        int flag=0,ind=0;
        System.out.println("Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==k){
                flag=1;
                ind=i;
            }
        }
        if(flag==0)
        System.out.println("Key Not Found at any index");
        else
        System.out.println("Found at  a index : "+ind);
    }
}
