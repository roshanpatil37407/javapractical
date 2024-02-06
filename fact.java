import java.util.Scanner;
 class fact {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
       int n =obj.nextInt();
       int fact=1;

        for (int i = 1; i <= n; i++) {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}