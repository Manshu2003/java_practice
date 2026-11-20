
import java.util.Scanner;

public class Video18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you age");
        int age= sc.nextInt();
        //if and elseif condition statement
        /*
        
        if (age>60) {
            System.out.println("why to here goto your home");
        } 
        else if (age>50) {
            System.out.println("Goto your son");
        }
        else if (age>22) {
            System.out.println("Yes your come and next day going to job");
        }
        else{
            System.out.println("Get out my java program");
        }
         */

        // Switch condition statment
        switch (age) {
            case 10:
                System.out.println("not coming");
                break;
        case 20:{
        System.out.println("Enter");
        break;
        }
            default:
            System.out.println("sorry");
                break;
        }
    }
}
