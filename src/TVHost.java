//Representation of a TV host fronting the lottery TV programme.
public class TVHost extends Person{

    public TVHost(String name){
        super(name);
    }

    public String getPersonType() {
        return "TV Host";
    }

    public String getCurrentSaying() {
        return "Welcome, suckers!";
    }
}
