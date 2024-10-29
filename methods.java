import java.util.Scanner;

class methods {
    static void myName(String fname, int age){
        System.out.println("My name is "+fname+ ". My age is " +age+ ".");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        myName(name, age);

    }
}
