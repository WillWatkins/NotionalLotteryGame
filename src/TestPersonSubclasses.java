public class TestPersonSubclasses {

    public static void main(String[] args){

        Person[] persons =  {
                new AudienceMember("JJ"),
                new Director("WW"),
                new Psychic("AB"),
                new Punter("MP"),
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
    }
}
