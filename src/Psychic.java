//Representation of a psychic entertainer for the lottey
public class Psychic extends Person {

    public Psychic(String name) {
        super(name);
    }

    public String getPersonType() {
        return "Psychic";
    }

    public String getCurrentSaying() {
        return "I can see someone very happy!";
    }
}
