import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        System.out.println("Hello, World!");
        MethodTester.testMethod();
        System.out.println("Type 'hi' 'bye' ':)' or anything else");
        String b = a.nextLine();
        while (!b.equals("quit"))
            if (b.equals("hi")) {
                person.sayHello();
                b = a.nextLine();
            }
             else if (b.equals("bye")) {
                person.sayBye();
                b = a.nextLine();
            }
             else if (b.equals(":)")) {
                person.showHappy();
                b = a.nextLine();
            }
             else {
                person.showConfusion();
                b = a.nextLine();
            }
}
}