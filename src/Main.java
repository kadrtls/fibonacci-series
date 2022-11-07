import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int x= scanner.nextInt();
        for (int i=0;i<x;i++){
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
        }
        }
    }
