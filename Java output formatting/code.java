import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf(s1);
                for(int j=s1.length();j<15;j++){
                    System.out.printf(" ");
                }
                String s2=String.format("%03d",x);
                System.out.println(s2);    
            }
            System.out.println("================================");
            }
        
}
