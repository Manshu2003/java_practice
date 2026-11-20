import java.util.Scanner;

public class Video21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int i= sc.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i<10);
        System.out.println("This is a second do-while loop condition:");
        do {
            
            System.out.println(i);
            i++;
        } while (i<=15);
    }
}
