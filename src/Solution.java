import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                for (int j=0; j<(15-s1.length());j++) {
                   System.out.print(" "); 
                }
                for (int k=0; k<(3 -  String.valueOf(x).length());k++) {
                   System.out.print("0"); 
                }
                System.out.println(x);
            }
            sc.close();
            System.out.println("================================");

    }
}



