//Representation of a container of balls for the lottery
//with a fixed size and zer or more balls in a certain order
public abstract class BallContainer {

    //the name of the ball container
    private final String name;

    //The balls contained in the BallContainer
    private final Ball[] balls;

    //The number of balls contained in the BallContainer
    //These ares stored in balls, indexes 0 to noOfBalls-1.
    private int noOfBalls;

    //Constructor is given the name and size
    public BallContainer(String requiredName, int requiredSize){
        name = requiredName;
        balls = new Ball[requiredSize];
        noOfBalls = 0;
    }

    //Returns the BallContainer's name
    public String getName() {
        return name;
    }

    //Returns the name of the type of BallContainer
    public abstract String getType();

    //Returns the Ball at the given index in the BallContainer,
    //or null if that index is not in the range of 0 to noOfBalls-1.
    public Ball getBall(int index){
        if (index >= 0 && index < noOfBalls)
            return balls[index];
        else
            return null;
    }

    //Return the number of balls in the BallContainer
    public int getNoOfBalls() {
        return noOfBalls;
    }

    //Return the size of the BallContainer.
    public int getSize(){
        return balls.length;
    }

    //Adds the given ball into the BallContainer, at the next highest unused
    //index positions. Has no effect if the BallContainer if full
    public void addBall(Ball ball){
        if (noOfBalls < balls.length) {
            balls[noOfBalls] = ball;
            noOfBalls++;
        }
    }

    //Swaps the balls at the two given index positions.
    //Has no effect if either index is not in the range 0 to noOfBalls-1.
    public void swapBalls(int index1, int index2){
        if (index1 >= 0 && index1 < noOfBalls && index2 >=0 && index2 < noOfBalls){
            Ball thatWasAtIndex1 = balls[index1];
            balls[index1] = balls[index2];
            balls[index2] = thatWasAtIndex1;
        }
    }

    //Removes the Ball at the highest used index position
    //Has no effect if the BallContainer is empty
    public void removeBall(){
        if (noOfBalls > 0)
            noOfBalls--;
    }

    //Mainly for testing
    public String toString(){
        String result = getType() + " " + name + "(<=" + balls.length + ")";
        for (int index = 0; index < noOfBalls; index++)
            result += String.format("%n%d %s", index, balls[index]);
        return result;
    }
}
