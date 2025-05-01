import java.util.Scanner;
class Student {
	private String name;
	private int rollNo;
	private String course;
	
	Student(String name,int rollNo,String course){
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getRollNo(){
		return rollNo;
	}
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public String getCourse(){
		return course;
	}
	public void setCourse(String course){
		this.course = course;
	}
	public void display(){
		System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Course: " + course);
	}
}

class Rectangle {
	private int length;
	private int breadth;
	
	Rectangle(){
		
	}
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public int area(){
		return length * breadth;
	}
}

class Calculator {
	int add(int a, int b){
		return a + b;
	}
	
	int add(int a, int b, int c){
		return a + b + c;
	}
	
	double add(double a, double b){
		return a + b;
	}
}

class Vehicle {
	String brand;
	int speed;
	
	void display(){
		System.out.println("Brand: " + brand + ", Speed: " + speed);
	}
}
	
class Car extends Vehicle{
	String model;
		
	void display(){
		System.out.println("Brand: " + brand + ", Speed: " + speed + ", Model: " + model);
	}
}

class BankAccount {
	private String accountHolderName;
	private double balance;
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount){
		if(amount<= balance ){
			balance -= amount;
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
	
	public void displayBalance(){
		System.out.println("Balance: " + balance);
	}
}

class Book{
	private String title;
	private String author;
	private double price;
	
	Book(String title, String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		this.price = 0;
	}
}

class Shape{
	void area(){
		System.out.println("Area not defined");
	}
}

class Circle extends Shape {
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void area(){
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
}

class Person{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	} 
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public void acceptInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		this.name = scanner.nextLine();
		System.out.print("Enter age: ");
		this.age = scanner.nextInt();
	}
}

class TemperatureConverter{
	double toFahrenheit(double celsius){
		return (celsius * 9/5) + 32;
	}
	double toCelsius(double fahrenheit){
		return (fahrenheit - 32) * 5/9;
	}
}

class Employee {
	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayDetails(){
		System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
	}
}
	class Manager extends Employee{
		Manager(String name, int id, double salary){
			super(name, id, salary);
		}
		
		void displayDetails(){
			super.displayDetails();
			double bonus = salary * 0.1;
			System.out.println("Bonus: " + bonus);
		}
	}

public class Tester{
	public static void main(String[] args){
		
		Student student = new Student("John Doe", 101, "Information Technology");
		student.display();
		 
		Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);
        System.out.println("Area of rect2: " + rect2.area());
		 
		Calculator calc = new Calculator();
        System.out.println("Add two integers: " + calc.add(2, 3));
        System.out.println("Add three integers: " + calc.add(2, 3, 4));
        System.out.println("Add two doubles: " + calc.add(2.5, 3.5));
		  
		Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.model = "Corolla";
        car.display();
        
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(1500);
        account.displayBalance();
        
        Book book1 = new Book("Java Basics", "Author A", 300.0);
        Book book2 = new Book("Python Essentials", "Author B");

        Circle circle = new Circle(5.0);
        circle.area();

        Person person = new Person();
        person.setName("Alice");
        person.setAge(25);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());

        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("30 Celsius to Fahrenheit: " + converter.toFahrenheit(30));
        System.out.println("86 Fahrenheit to Celsius: " + converter.toCelsius(86));

 		Manager manager = new Manager("Bob", 201, 75000);
        manager.displayDetails();
	}
}