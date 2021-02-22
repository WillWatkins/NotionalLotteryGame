//Representation of a lottery machine,
//with the facility for a randomly chosen ball to be ejected.

public class Machine extends BallContainer {

    //Constructor is given the name and size
    public Machine(String name, int size) {
        super(name,size);
    }
    public String getType(){
        return "Lottery machine";
    }

    public Ball ejectBall(){

        if (getNoOfBalls() <= 0)
            return null;
        else {
            //Math.random() * getNoOfBalls yields a number
            //which is >=0 and < number of balls.
            int ejectedBallIndex = (int) (Math.random() * getNoOfBalls());

            Ball ejectedBall = getBall(ejectedBallIndex);
            swapBalls(ejectedBallIndex, getNoOfBalls() - 1);
            removeBall();

            return ejectedBall;
        }
    }
}
