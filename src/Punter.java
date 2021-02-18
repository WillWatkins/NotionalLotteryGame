//Representation of a person playing the lottery
public class Punter extends Person{


    public Punter(String name){
        super(name);
    }

    @Override
    public String getPersonType() {
        return "Punter";
    }

    @Override
    public boolean isHappy(){
        return false;
    }

    @Override
    public String getCurrentSaying(){
        return "Make me happy: give me lots of money";
    }
}
