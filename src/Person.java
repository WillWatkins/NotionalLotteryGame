//Representation of a person involved somehow in the lottery
public abstract class Person {

    //The name of the person
    private final String personName;

    //The person's latest saying
    private String latestSaying;


    //Constructor is given the person's name
    public Person(String requiredPersonName){

        personName = requiredPersonName;
        latestSaying = "I am " + personName;
    }

    //Return the Person's name
    public String getPersonName() {
        return personName;
    }

    //Return the Person's latest saying
    public String getLatestSaying() {
        return latestSaying;
    }

    //Returns the name of the type of Person
    //Each subclass will define this method as to be appropriate to that subclass
    public abstract String getPersonType();

    //Returns whether or not the Person is happy
    //This will be redefined in the appropriate subclass(es).
    public boolean isHappy(){
        return true;
    }

    //Returns the Person's current saying
    //This will be defined in subclasses.
    public abstract String getCurrentSaying();

    //Causes the person to speak by updating their latest sayging from their current saying
    public void speak(){
        latestSaying = getCurrentSaying();
    }

    //Mainly for testing
    public String toString(){
        return getPersonType() + " " + getPersonName() + " " + isHappy() + " " + getLatestSaying();
    }

}
