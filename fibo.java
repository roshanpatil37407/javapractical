import java.util.Scanner;
class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int count=sc.nextInt();
        int n=0;
        int n1=1;
        System.out.println(n);
        System.out.println(n1);
        for(int i=2;i<count;i++){
            int temp=n;
            n=n1;
            n1=temp+n1;
            System.out.println(n1);
        }
    }
}