import java.util.Scanner;

class MyClass{
  String name;
  int roll_no;
  int age;
  double height;
  double weight;

  //Constructor Overloading
  MyClass(){
    name="Unknown";
    roll_no= 0;
    age = 0;
    height = 0.0;
    weight = 0.0;
  }
  MyClass(String n) {
  name = n;
  System.out.println("Your name is "+name);
  }

  MyClass(String n, int r) {
  name = n;
  roll_no = r;
  System.out.println("Your name is "+name+" and your roll number is "+roll_no);
  }

  MyClass(String n, double h, double w) {
  name = n;
  height = h;
  weight = w;
  System.out.println("Hi "+name+" your height is "+height+" cm and weight is "+weight+" kg");
  }

  // Method overloading
  void work(String n, int a){
    name = n;
    age = a;
    System.out.println("Your name is "+name);
    if(age>=18){
      System.out.println("You are eligible to vote");
    }else{
      System.out.println("You are not eligible to vote");
    }
  }

  void work(int r) {
    roll_no = r;
    String batch = (roll_no<35)?"You are in A batch":"You are in B batch";
    System.out.println(batch);
  }

  void work(double h, double w){
    height = h;
    weight = w;
    if(height <= 140 && weight>=80){
      System.out.println("You are overweight");
    } else if(height > 140 && (weight>=40)&&(weight<=80)){
      System.out.println("You are perfectly healthy");
    } else{
      System.out.println("You are underweight");
    }
  }
}

public class constructor{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name:");
    String n = sc.nextLine();
    System.out.println("Enter your roll number:");
    int r = sc.nextInt();
    System.out.println("Enter your age:");
    int a = sc.nextInt();
    System.out.println("Enter your height in cm:");
    double h = sc.nextDouble();
    System.out.println("Enter your weight in kg:");
    double w = sc.nextDouble();

    MyClass obj = new MyClass(n);
    MyClass obj1 = new MyClass(n,r);
    MyClass obj2 = new MyClass(n,h,w);

    MyClass class1 = new MyClass();
    class1.work(n,a);
    class1.work(r);
    class1.work(h,w);
  sc.close();
  }
}

// 1. constructor overloading
/*
import java.util.Scanner;

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();             // uses default constructor
        Student s2 = new Student("Saniya", 19); // uses parameterized constructor

        s1.display();
        s2.display();
    }
}
*/

// 2. Method overloading 
/*
import java.util.Scanner;

class Calculator {

    // Method with 2 int parameters
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Method with 3 int parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    // Method with double parameters
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

public class method {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter First integer number: ");
      int intA = sc.nextInt();
      System.out.println("Enter Second integer number: ");
      int intB = sc.nextInt();
      System.out.println("Enter Third integer number: ");
      int intC = sc.nextInt();


      System.out.println("Enter First Double number: ");
      double doubleA = sc.nextDouble();
      System.out.println("Enter Second Double number: ");
      double doubleB = sc.nextDouble();

      Calculator calc = new Calculator();

      calc.add(intA, intB);          // calls int version
      calc.add(doubleA, doubleB);    // calls double version
      calc.add(intA, intB, intC);    // calls 3-int version
    }
}
*/

