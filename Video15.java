
import java.util.Scanner;
public class Video15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

//Q1.Write a Java program to convert a string to lowercase.

    String name2="MANSHU";
        System.out.println(name2.toLowerCase());

//Q2.Write a Java program to replace spaces with underscores.

String name3= "hey my name is manshu  . What is you name . Wow your name is awsome ";
System.out.println(name2.replace('M','N'));

//Q3.Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”
// Replace <|name|> with a string (some name)

String name1= "<NAME>";
System.out.println("Dear\t"+name1.replace("<NAME>","ANSHU"+"  Thanks of lot"));

//Q4.Write a Java program to detect double and triple spaces in a string.

System.out.println(name3.indexOf("  "));
System.out.println(name3.indexOf("   "));

//Q5.Write a program to format the following letter using escape sequence characters.
//Hey my name is manshu.\n\tWhat is you name\n\t my name is <name2>.\n\tHey harry how are you.

String name= "Hey my name is manshu.\n\tWhat is you name\n\t my name is <name2>.\n\tHey harry how are you.";
System.out.println(name.replace("<name2>", "Harry"));
    }
}
