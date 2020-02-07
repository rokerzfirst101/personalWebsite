import java.util.Scanner;
import java.io.*; 
import java.util.*; 

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //int count = 0;
        int n = scan.nextInt();
        int k = scan.nextInt();
        long a[] = new long[n];
        
        long count=0;
        for(int i=0;i<n;i++){
            a[i]=scan.nextLong();
            //System.out.println(a[i]);
        }
        
        for(int i = 0;i < n; i++){
            for(int j=i+1; j < n; j++){
                if((a[i]+a[j])%k==0){
                    System.out.println(a[i]+"+"+a[j]+"="+(a[i]+a[j]));
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Constraint violated");
        } else {
        System.out.println(count);
        }
    }
}
