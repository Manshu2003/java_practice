public class Video24 {
    public static void main(String[] args) {
        /* Q1 write a program to print the following pattern

        ******
        ****
        ***
        **
        *
         */

         /* 
        int n=5;
       
        for (int i=n;i>0;i--) {
           for(int b=0;b<i;b++){
            System.out.print("*");
           }
           System.out.print("\n");
        } 
      */

//Q2  Write a program to sum first n even numbers using a for loop.
/*
int sum1=0;
int n1=4;

for (int i=0;i<n1; i++) {
    sum1=sum1+(2*i);
}
System.out.println(sum1);
 */
//Q3 Write a program to print the multiplication table of a given number n.
/*
int n=5;
for (int i = 1; i <=10; i++) {
    System.out.printf("%d X %d = %d\n ",n,i,i*n);
}
     */
//Q4 Write a program to print a multiplication table of 10 in reverse order.
/*
int n1=10;
for (int i = 10; i>=1; i--) {
    System.out.printf("%d X %d = %d\n ",n1,i,i*n1);
}
     */
//Q5 Write a program to find the factorial of a given number using for loops.
/*
int n=5;
int f=1;
for(int i=1; i<=n; i++){
    f *=i;
} 
System.out.println(f);
*/

//Q6  Repeat problem 5 using a while loop.
/*
int i=1;
int n=5;
int f=1;
while(i<=n){
f *=i;
i++;
}
System.out.println(f);

 */

 //Q7 Repeat problem 1 using for/while loop.
 /*
 int n=5;
 int f=1;
for(int i=1; i<=n;i++){
    f *=i;
}
 System.out.println(f);
  */
//Q9 Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
/*
int n=8;
int sum=0;
for(int i=1;i<=10;i++)
{
   sum+=i*n;
}

System.out.println(sum);
 */
//Q10 Write a program to sum first n even numbers using a while loop.
int n=4;
int sum=0;
int i=0;
while (i<n) { 
    sum=sum+2*i;
    i++;
}
System.out.println(sum);
    }
}
