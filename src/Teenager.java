//Representation of a teenager

public class Teenager extends MoodyPerson {

    public Teenager(String name){
        super(name, false);
    }

    //Method implementation rather than an override
    //Returns the name of the person type
    public String getPersonType() {
        return "Teenager";
    }

    //Method implementation rather than an override
    //Returns the persons current saying
    public String getCurrentSaying() {
        if (isHappy())
            return "Isn't life wonderful";
        else
            return "It's not fair!";
    }


}
