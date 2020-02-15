public class TowerOfHanoi {


    public static void moveHoops(int numberOfHoops, int startPeg, int endPeg) {
        if(numberOfHoops == 1) {
            System.out.println("Move hoop from peg " + startPeg + " to peg " + endPeg);
        } else {
            int bridgePeg = getBridgePeg(startPeg, endPeg);
            moveHoops(numberOfHoops -1, startPeg, bridgePeg);
            moveHoops(1, startPeg, endPeg);
            moveHoops(numberOfHoops - 1, bridgePeg, endPeg);
        }
    }

    private static int getBridgePeg(int startPeg, int endPeg) {
        boolean[] pegIdentifiedArray = {false, false, false};
        pegIdentifiedArray[startPeg - 1] = true;
        pegIdentifiedArray[endPeg - 1] = true;

        for(int loopIndex = 0; loopIndex < pegIdentifiedArray.length; loopIndex++) {
            if(!pegIdentifiedArray[loopIndex]) {
                return loopIndex + 1;
            }
        }
        return -99;
    }
}
