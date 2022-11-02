import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Triangle triangle=new Triangle();
        System.out.println("Write 1st number: ");
        triangle.a= scanner.nextFloat();
        System.out.println("Write 2nd number: ");
        triangle.b= scanner.nextFloat();
        System.out.println("Write 3th number: ");
        triangle.c= scanner.nextFloat();

        System.out.println(triangle.area());

    }
}