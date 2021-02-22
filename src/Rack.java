// Representation of a landing rack of balls for the lottery,
// with the facility for them to be sorted into order,
// and another to determine if it contains a ball of a given value.

public class Rack  extends BallContainer {

    //Constructor is given the name and size
    public Rack(String name, int size){
        super(name,size);
    }

    //Return the name of the type of BallContainer
    public String getType(){
        return "Landing rack";
    }

    //Sort the balls in the rack in ascending order
    //using their compareTo() methods
    public void sortBalls(){

        //Each pass of the sort reduces unsorted Length by one.
        int unsortedLength = getNoOfBalls();

        //If no change is made on a pass, the main loop can stop
        boolean changeOnThisPass;

        do {
            changeOnThisPass = false;
            for (int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++)
                if (getBall(pairLeftIndex).compareTo(getBall(pairLeftIndex+1)) >0) {
                    swapBalls(pairLeftIndex, pairLeftIndex + 1);
                    changeOnThisPass = true;
                }
            unsortedLength--;
        }
        while (changeOnThisPass);
    }

    //Return true if and only if the rack contains
    //a ball with the given number
    public boolean contains(int value){
        boolean found = false;
        int index = 0;
        while (!found && index < getNoOfBalls()){
            found = getBall(index).getValue() == value;
            index++;
        }
        return found;
    }
}
