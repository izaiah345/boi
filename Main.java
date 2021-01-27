import java.util.Scanner;

class Main {
 public static void main(String[] args) 
 {
  Scanner scan = new Scanner(System.in);

  System.out.println("What is your name");
  String name = scan.next();
  System.out.println("What year is it");
  int currentYear = scan.nextInt();
  System.out.println("What is your birth month?");
  int birthYear = scan.nextInt();
 
  int age = getAge(birthYear, currentYear);

  System.out.println(greeting(name));
  System.out.println("You enounterd true love in year was I right?" + age);
  
  System.out.println("lover 1 + 1 lover equals? " + Sum(1,1));

 }


  
 static int getAge(int birthMonth, int currentYear)
 {
 int age = birthMonth - currentYear;
 return age;
 }
  static String greeting(String name)
 {
  String hello = "Hello "+ name;
  return hello; 
 }
 // new method    
static int Sum(int num1, int num2)
 {
return num1 + num2;
 }
}
