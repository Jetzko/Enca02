import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        person1.setName(name);
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        person1.setSurname(surname);
        System.out.println("Hi " + name + " " + surname + "!");
        System.out.println("What is your height in cm?");
        double height = scanner.nextDouble();
        person1.setHeight(height);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        person1.setAge(age);
        System.out.println("Thank you " + name + " " + surname + ". You are " + age + " years old and you are " + height + "cm tall!" );

        /*person1.setName("Luca");
        person1.setSurname("Alfieri");
        person1.setHeight(170.24);
        person1.setAge(31);
        System.out.println(person1);*/
    }
}
