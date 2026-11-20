import java.net.Socket;
import java.util.Scanner;

public class Video19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//Q1. What will be the output of this program: 
       /*
       int a = 10;
if (a==10){
        System.out.println("yes");
    }
else{
        System.out.println( "no");
    }
         */

//Q2.Write a program to find out whether a student is pass or fail; if it requires a total of 40% and
// at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
/* 
System.out.println("Enter your Subject a marks");   
float a= sc.nextFloat();
System.out.println("Enter your Subject b marks");
    float b= sc.nextFloat();
    System.out.println("Enter your Subject c marks");
    float c= sc.nextFloat();
    float total= a+b+c;
    float total1=(float)((total/300.0)*100);
System.out.println(total1);
if (total1>=40) {
    System.out.println("you are pass");
}
else{
    System.out.println("fails");
}
 */

//Q3.Calculate income tax paid by an employee to the government as per the slabs mentioned below:

//Income Slab	Tax
//2.5L – 5.0L  	5%
//5.0L – 10.0L 	20%
//Above 10.0L	30%
/*
System.out.println("Enter your income in Lakhs per annum");
float tax=0;

float income =sc.nextFloat();

if (income<=2.5f) {
    tax= tax +0;
}
else if (income>2.5f && income<=5f) {
    tax=tax+0.05f*(income-2.5f);
}
else if (income>5f && income<=10.0f) {
    tax=tax+0.05f*(.05f-2.5f);;
    tax=tax+0.2f*(income-5f);;
}
else if (income>10.0f) {
    tax=tax+0.05f*(5.0f-2.5f);;
    tax=tax+0.2f*(10.0f-5f);;
    tax=tax+0.3f*(income-2.5f);;
}
System.out.println("The Total tax paid by the employee is:"+tax);
 */

//Q4. Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!].

 /*
System.out.println("Enter you day ");
int day = sc.nextInt();
 switch (day) {
    case 1:{
        System.out.println("M");
        break;}
 case 2:
 {
    System.out.println("T");
    break;
 }
 case 3:{
    System.out.println("W");
    break;}
case 4:{

System.out.println("TH");
break;
}
case 5:{
    System.out.println("F");
    break;}
case 6:{

System.out.println("S");
break;
}
case 7:{

    System.out.println("SU");
    break;
    }
    default:
    System.out.println("Thank you day is done");
        break;
 
}
         */

 //Q5.Write a Java program to find whether a year entered by the user is a leap year or not.
System.out.println("Enter your year");
int year= sc.nextInt();
if ((year%4==0 && year%100!=0)||year%400==0) {
    System.out.println(year+"is a leap year");
}
else{
    System.out.println(year+ " is not a leap year");
}

//Q6.Write a program to find out the type of website from the URL:

//.com – commercial website
//.org – organization website
//.in – Indian website
/*

System.out.println("Enter your Website Here");
String website= sc.next();
if (website.endsWith(".org")) {
    System.out.println("This is an organization website");
}
else if (website.endsWith(".com")) {
    System.out.println("This is a commerxial website");

}
else if (website.endsWith(".in")) {
    System.out.println("Indian website");
}
 */


    }

}

    