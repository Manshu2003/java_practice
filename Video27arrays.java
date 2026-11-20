public class Video27arrays {
    public static void main(String[] args) {
        // A 2-D Array
        int[][] room= new int[2][3];
        room [0][0]=101;
        room [0][1]=102;
        room [0][2]=103;
        room [1][0]=201;
        room [1][1]=202;
        room [1][2]=203;
        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for (int i = 0; i <room.length; i++) {
            for (int idx = 0; idx < room[i].length; idx++) {  
            
            System.out.print(room[i][idx]);
            System.out.print(" ");
        }
        System.out.println("");
    }
    }
}
