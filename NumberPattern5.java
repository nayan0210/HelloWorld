/*
54321 
5432 
543
54 
5
*/import java.util.Scanner;

public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;j>=n-i+1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }

}
}
