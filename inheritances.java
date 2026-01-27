import java.util.Scanner;
/*
//Single Inheritance

//Parent class
class Person{
  String name;
  int age;

  void getDetails(Scanner sc){
    System.out.println("Enter your name: ");
    name = sc.nextLine();
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    sc.nextLine();
  }

  void showDetails(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
  }
}

//Child class
class Student extends Person{
  int rollNumber;
  int marks;

  void getStudentDetails(Scanner sc){
    getDetails(sc);
    System.out.println("Enter your Roll no.: ");
    rollNumber = sc.nextInt();
    System.out.println("Enter your total marks: ");
    marks = sc.nextInt();
    sc.nextLine();
  }

  void showStudentDetails(){
    showDetails();
    System.out.println("Roll no: "+rollNumber);
    System.out.println("Marks: "+marks);
  }
}

public class inheritances{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student student1 = new Student();
    student1.getStudentDetails(sc);
    System.out.println("------Student Details-------");
    student1.showStudentDetails();

    sc.close();
  }
}
*/

//Multi Level Inheritance
/*
// class 1
class Animal{
  void eat(){
    System.out.println("Animal is eating");
  }
}

// class 2 : Child class of class1
class Mammal extends Animal{
  void walk(){
    eat();
    System.out.println("Mammal is walking");
  }
}

// class 3: Child class of class2
class Dog extends Mammal{
  void bark(){
    walk();
    System.out.println("Dog is barking");
  }
}

public class inheritances{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Dog myDog = new Dog();
    System.out.println("------Details-------");
    myDog.bark();
    sc.close();
  }
}
*/


//Heirarchial inheritance

// Parent class
class Shape {
  String name = "Geometrical Shape";

  void display(){
    System.out.println("This is a "+name);
  }
}

// Child class 1
class Circle extends Shape{
  double radius;
  void area(Scanner sc){
    name = "Circle";
    display();
    System.out.println("Enter the radius of circle");
    radius = sc.nextDouble();
    double area = 3.142 * radius * radius;
    System.out.println("Area of circle: "+area);
    sc.nextLine();
  }
}

// Child class 2
class Rectangle extends Shape{
  double length;
  double breadth;
  void area(Scanner sc){
    name = "Rectangle";
    display();
    System.out.println("Enter the length of Rectangle");
    length = sc.nextDouble();
    System.out.println("Enter the breadth of Rectangle");
    breadth = sc.nextDouble();
    double area = length * breadth;
    System.out.println("Area of Rectangle: "+area);
    sc.nextLine();
  }
}

public class inheritances{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
    Circle myCircle = new Circle();
    Rectangle myRectangle = new Rectangle();

    System.out.println("------Details-------");
    
    myCircle.area(sc);
    System.out.println(" ");
    myRectangle.area(sc);
  
    sc.close();
  }
}
