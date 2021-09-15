public class TowerOfHanoi {


    public static void moveHoops(int numberOfHoops, int startPeg, int destinationPeg) {
        if(numberOfHoops == 1) {
            System.out.println("Move hoop from peg " + startPeg + " to peg " + destinationPeg);
        } else {
            int bridgePeg = getBridgePeg(startPeg, destinationPeg);
            moveHoops(numberOfHoops -1, startPeg, bridgePeg);
            moveHoops(1, startPeg, destinationPeg);
            moveHoops(numberOfHoops - 1, bridgePeg, destinationPeg);
        }
    }

    private static int getBridgePeg(int startPeg, int destinationPeg) {
        boolean[] pegIdentifiedArray = {false, false, false};
        pegIdentifiedArray[startPeg - 1] = true;
        pegIdentifiedArray[destinationPeg - 1] = true;

        for(int loopIndex = 0; loopIndex < pegIdentifiedArray.length; loopIndex++) {
            if(!pegIdentifiedArray[loopIndex]) {
                return loopIndex + 1;
            }
        }
        return -99;
    }
}
