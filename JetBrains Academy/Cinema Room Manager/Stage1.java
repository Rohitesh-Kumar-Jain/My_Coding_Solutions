package cinema;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        for(int i=0;i<=8;i++){
            if(i==0) System.out.print("  ");
            else{
                System.out.print(i + " ");
            }
        }
        for(int i=1;i<=7;i++){
            System.out.println();
            System.out.print(i +" ");
            for(int j=0;j<8;j++){
                System.out.print("S" + " ");
            }
        }
    }
}