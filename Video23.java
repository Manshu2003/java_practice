import java.util.Scanner;

public class Video23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //break condition
        /*
        for(int i=0; i<5;i++)
        {
            System.out.println(i);
            if (i==2) {
                System.out.println("hello");
                break;
    }
                }
 */
            for(int i=0; i<5;i++)
        {
            
            if (i==2) {
                System.out.println("hello");
                continue;
            }
            System.out.println(i);
            System.out.println("bye");
        }
        }
    }

