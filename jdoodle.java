import java.util.Scanner;

class Main {

public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);

System.out.println("Enter your name: ");
String name = myObj.nextLine();
System.out.println("Welcome \t" + name);

System.out.println("Enter age: ");
int age = myObj.nextInt();
System.out.println("Age: \t\t" + age);

System.out.println("Enter year today: ");
int year = myObj.nextInt();

int time = year - age;
System.out.println("birth year: " + time);


System.out.println("Enter course: ");
String course = myObj.next();
System.out.println("Course: \t" + course);


}
}