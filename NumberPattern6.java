/*
1   
123 
12345    
1234567  
123456789
*/import java.util.Scanner;

public class NumberPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
