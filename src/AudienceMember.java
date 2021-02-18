//Representation of an audience member watching the lottery.
//A subclass of Person.

public class AudienceMember extends Person {

    public AudienceMember(String name){
        super(name);
    }

    @Override
    //Overrides the superclasses method
    public String getPersonType(){
        return "Audience Member";
    }

    @Override
    public String getCurrentSaying(){
        return "Oooooh!";
    }
}
