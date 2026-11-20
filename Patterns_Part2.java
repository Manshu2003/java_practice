public class Patterns_Part2 {
    public static void main(String[] args) {
       
        //Q11.
        //upper part
        // int n = 4;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
                
        //     }
        //     int space=2*(n-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();}
        //     //lower part
        //     for(int i=n;i>=1;i--)
        //     {
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
                    
        //         }
        //         int space=2*(n-i);
        //         for(int j=1;j<=space;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();

        // }

//Q12.
// int n = 5;
// for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             } 
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             } 
//             System.out.println();}
    
//Q13.
// int n = 5;
// for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             } 
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             } 
//             for(int j=2;j<=i;j++){
//                 System.out.print(j+" ");
//             } 
//             System.out.println();}

//Q14.
// int n=4;
// for(int i=1;i<=n;i++){
// for(int j=1;j<=n-i;j++){
//     System.out.print(" ");
// }
// for(int j=1;j<=i;j++)
// {
   
//     System.out.print(i+" ");
// }
// System.out.println();
// }

//Q15.
int n=4;
//upper part
for(int i=1; i<=n;i++){
    for(int j=1; j<=n-i;j++){
    System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*"+" ");
}
System.out.println();}

//lower part
for(int i=n; i>=1;i--){
    for(int j=1; j<=n-i;j++){
    System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*"+" ");
}
System.out.println();}
    }
}
