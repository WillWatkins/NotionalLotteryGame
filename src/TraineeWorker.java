import java.awt.Color;

//Representation of a trainee lottery worker, who has an efficiency rating effecting the accuracy of
//ball numbering
public class TraineeWorker extends Worker{

    //The efficiency of the trainee worker
    private final double efficiency;

    //Constructor is given the person's name and the required efficiency.
    public TraineeWorker(String name, double requiredEfficiency){
        super(name);
        efficiency = requiredEfficiency;
    }

    @Override
    //Returns the person's name and efficiency added in brackets.
    public String getPersonName(){
        return super.getPersonName() + " (" + efficiency + " efficiency)";
    }

    @Override
    //Returns the name of the type of person
    public String getPersonType(){
        return "Trainee" + super.getPersonType();
    }

    @Override
    //Returns a newly created Ball with the given number and colour
    public Ball makeNewBall(int number, Color colour){
        if (Math.random() >= efficiency)
            if (Math.random() < 0.5)
                number--;
            else
                number++;
        return new Ball(number, colour);
    }


}
