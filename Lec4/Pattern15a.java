package Lec4;
public class Pattern15a {
    public static void main (String[] args) {
        int n=5;
        for(int row=1;row<=2*n-1;row++){
            // space
            int total_no_of_space=((row<=n?n-row:row-n));
            for(int space=1;space<=total_no_of_space;space++){
                System.out.print("  ");
            }
            // star
            int toatal_no_of_star=((row<=n?(n+1)-row:row-n+1));
            for(int star=1;star<=toatal_no_of_star;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
