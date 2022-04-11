import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Task 1: Sum of Digits / Digital Root

        System.out.println("Task 1: Sum of Digits / Digital Root");
        System.out.println("Введите неотрицательное целое число n");
        int n = sc.nextInt();
        int dr = DRoot.digital_root(n);
        System.out.println("Цифровой корень n = " + dr);
        System.out.println();
    }


    // Task 1: Sum of Digits / Digital Root
  
    public static class DRoot 
    { 
      public static int digital_root(int n) 
      { 
        int k = 0; 
        while (n>=10)
        { 
          while (n>0)
          { 
            k += n%10; 
            n = n/10; 
          } 
          n = k; 
          k = 0; 
        } 
        return n; 
      } 
    }
}
