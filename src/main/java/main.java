import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Enter the number of hoops on the tower: ");

        Scanner input = new Scanner(System.in);
        int numberOfHoops = input.nextInt();

        int startPeg = 1;
        int endPeg = 3;
        TowerOfHanoi.moveHoops(numberOfHoops, startPeg, endPeg);
    }
}
