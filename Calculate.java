
import java.util.Scanner;
//Q1Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

public class Calculate {
    public static void main(String[] args) {
       
        // this is a simple programming
        // System.out.println("Enter your number of a");
        // int a= sc.nextInt();
        // System.out.println("Enter your number of b");
        // int b= sc.nextInt();
        // int sum1=a+b;
        // int sum2=a-b;
        //  int sum3=a*b; 
        //  int sum4=a/b;
        //  int sum5=a%b;
        //  System.out.println("A+b is \n"+sum1);
        //  System.out.println("A-b is \n"+sum2);
        //  System.out.println("A*b is \n"+sum3);
        //  System.out.println("A/b is \n"+sum4);
        //  System.out.println("A%b is \n"+sum5);

        // this is a switch statement.
    //     char operator ;
    //     Double number1, number2, result;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        
    //     operator = sc.next().charAt(0);
    //     System.out.println("enter your number 1");
    //     number1= sc.nextDouble();
    //     System.out.println("Enter your number b");
    //     number2= sc.nextDouble();   

    //    switch (operator) {
    //     case '+':
    //         result= number1+number2;
    //         System.out.println(number1+"+"+number2+"="+result);
    //         break;
    //     case '-':
    //         result= number1-number2;
    //         System.out.println(number1+"-"+number2+"="+result);
    //         break;
    //     case '*':
    //         result= number1*number2;
    //         System.out.println(number1+"*"+number2+"="+result);
    //         break;
    //     case '/':
    //         result= number1/number2;
    //         System.out.println(number1+"/"+number2+"="+result);
    //         break;
    //     case '%':
    //         result= number1%number2;
    //         System.out.println(number1+"%"+number2+"="+result);
    //         break;
    
    //     default:{
    //         System.out.println("invaild operator");
    //    }
//}
//Q2 Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print 
//‘February’ & so on.

// System.out.println("Enter your month number:-");
  
  
//    Scanner sc= new Scanner(System.in);
//    int month=sc.nextInt();

//    switch (month){
//     case 1:
//        System.out.println("January");
//        break;
//     case 2:
//        System.out.println("February");
//        break;
//     case 3:
//        System.out.println("March");
//        break;
//     case 4:
//        System.out.println("April");
//        break;
//     case 5:
//        System.out.println("May");
//        break;
//     case 6:
//        System.out.println("June");
//        break;
//     case 7:
//        System.out.println("July");
//        break;
//     case 8:
//        System.out.println("August");
//        break;
//     case 9:
//        System.out.println("September");
//        break;
//     case 10:
//        System.out.println("October");
//        break;
//     case 11:
//     System.out.println("November");
//         break;
//     case 12:
//     System.out.println(" December");
//         break;
//     default:
//     {
//         System.out.println("invalid month ");
//     }
//   }
// for(int i=0;i<=10;i++){
//     System.out.println(i);
// }

// int i =0;
// while(i<11){
// System.out.println(i);
// i++;
// }

// int i = 0;
// do { 
//     System.out.println(i);
//     i++;
// } while(i<11);


//Scanner sc = new Scanner(System.in);
// System.out.println("Enter your number");
// int n = sc.nextInt();
// int sum = 0;
// for (int i = 1; i <= n; i++) {
//     sum=sum+i;
// }
// System.out.println(sum);
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
for (int i=1; i <=10; i++) {
    System.out.printf("%d X %d = %d\n ",n,i,i*n);
}

    }
}
