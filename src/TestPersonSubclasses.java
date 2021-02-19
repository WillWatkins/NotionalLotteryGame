public class TestPersonSubclasses {

    public static void main(String[] args){

        Person[] persons =  {
                new AudienceMember("JJ"),
                new Director("WW"),
                new Psychic("AB"),
                new Punter("MP"),
                new Teenager("JW"),
                new TVHost("KH"),
        };

        for (Person person: persons)
            testPerson(person);
    }

    private static void testPerson(Person person){
        System.out.println("-----------------------------------------------------------------");
        System.out.println(person);
        person.speak();
        System.out.println(person);
        if (person instanceof MoodyPerson)
            testMoodyPerson((MoodyPerson)person);
    }

    //Make the given moody person change happiness then speak,
    //reporting the after toString, all twice.
    private static void testMoodyPerson(MoodyPerson moodyPerson){
        for (int count = 1; count <=2; count++) {
            moodyPerson.setHappy(!moodyPerson.isHappy());
            moodyPerson.speak();
            System.out.println(moodyPerson);
        }
    }
}
