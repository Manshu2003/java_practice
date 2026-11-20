
import java.util.Scanner;

public class CBSE {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
        System.out.println("Enter your marks in Hindi\n");
        float h= in.nextFloat();
        System.out.println("Enter your marks in English\n");
        float e= in.nextFloat();
        System.out.println("Enter your marks in Maths\n");
        float m= in.nextFloat();
        System.out.println("Enter your marks in Science\n");
        float s= in.nextFloat();
        System.out.println("Enter your marks in GoodStudent\n");
        float g= in.nextFloat();
        float total= h+e+m+s+g;
        float average=(float)(total/5.0);
        float percentage=(float)((total/500.0)*100);
        System.out.println("Your total marks is: "+ total);
        System.out.println("Your total average: "+ average);
        System.out.println("Your total percentage: "+ percentage);


    }
}
