import javax.swing.plaf.ColorUIResource;
import java.awt.Color;

//Representation of a worker making balls and filling up machines in the lottery
public class Worker extends MoodyPerson {

    public Worker(String name){
        super(name);
    }

    //Returns the name of the person's type
    public String getPersonType() {
        return "Worker";
    }

    //Returns the current person's saying.
    public String getCurrentSaying() {
        if (isHappy())
            return "Time for tea, I think";
        else
            return "Puff, pant, puff pant";
    }

    //Returns a newly created Ball with the given number and colour
    public Ball makeNewBall(int number, Color colour){
        return new Ball(number, colour);
    }

    //Makes this worker fill the machine of the given Game.
    //the balls are created as they are inserted into the machine.
    public void fillMachine(Game game){
        //Colours of balls are evenly spread between these colours, in ascending order.
        Color[] colourGroupColours = new Color[] {Color.red, Color.orange, Color.yellow, Color.green, Color.blue,
                Color.pink, Color.magenta};
        //This happiness change will show up when the GUI is added.
        setHappy(false);
        speak();

        int noOfBalls = game.getMachineSize();
        for (int count = 1; count <= noOfBalls; count++){
            //The colour group is a number from 0 to the number of colours groups -1.
            //For the nth ball, we take the fraction (n-1) divided by the number of balls
            //and multiply that by the number of groups.
            int colourGroup = (int) ((count - 1.0)/ (double) noOfBalls * (double) colourGroupColours.length);
            Color ballColour = colourGroupColours[colourGroup];
            game.machineAddBall(makeNewBall(count,ballColour));
        }
        setHappy(true);
        speak();
    }
}
