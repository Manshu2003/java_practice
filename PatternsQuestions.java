public class PatternsQuestions {
    public static void main(String[] args) {
//Q1
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){  
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
//Q2
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){  
        //         if (i==1||j==1||i==4||j==5) {
        //             System.out.print("*");
        //         } else {

        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }

//Q3.
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){  
//             System.out.print("*");
//         } 
//     System.out.println();
// }

//Q4.
// for(int i=4;i>=1;i--){
//     for(int j=1;j<=i;j++){  
//  System.out.print("*");
//         } System.out.println();
// }

//Q5.

// for( int i=1;i<=4;i++){
//     for (int j=1;j<=4-i; j++) {
//         System.out.print(" "); 
//     }
//         for(int j=1;j<=i;j++){  
//      System.out.print("*");
//             } System.out.println();
//     }

//Q6.
// int n=5;
// for( int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){  
//      System.out.print(j+" ");
//             } System.out.println();
//     }

//Q7.
// int n=5;
// for( int i=n;i>=1;i--){
//         for(int j=1;j<=i;j++){  
//      System.out.print(j+" ");
//             } System.out.println();
//     }

//Q8.
// int n=5;
// int number = 1;
// for( int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){  
//      System.out.print(number+" ");
//    number++;
//             } 
      
//             System.out.println();
            
//     }

//Q9.
int n = 5;
for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=i; j++) {
        int sum = i+j;
        if (sum%2==0) //even
        {
            System.out.print("1 ");
        } else { //odd
            System.out.print("0 ");
        }
        
    }
    System.out.println();
}
    }
}