//Representation of a director of the lottery company
public class Director extends Person{

    //Constructor is given the person's name
    public Director(String name) {
        super(name);
    }

    //Returns the name of the person type
    public String getPersonType(){
        return "Director";
    }

    //Returns the person's current saying
    @Override
    public String getCurrentSaying() {
        return "This business is MY pleasure";
    }
}
