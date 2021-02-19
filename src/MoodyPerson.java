//Representation of a Person involved in the lottery
//who can change their happiness state
//A subclass of Person that will also, itself, have subclasses.

public abstract class MoodyPerson extends Person {

    //The state of the Person's happiness
    private boolean isHappyNow;

    //Constructor is given the person's name and initial happiness.
    public MoodyPerson(String name, boolean initialHappiness){

        super(name);
        isHappyNow = initialHappiness;
    }

    //Alternatively, the constructor is given the person's name
    // and initial happiness is presumed to be true.
    public MoodyPerson(String name){
        this(name, true);
    }

    @Override
    //Returns whether a person is happy or not.
    public boolean isHappy(){
        return isHappyNow;
    }

    //Sets the happiness of the person to the given state
    public void setHappy(boolean newHappiness){
        isHappyNow = newHappiness;
    }

}
