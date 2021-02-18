//Create a person and make them speak
public class TestPerson {
    public static void main(String[] args){
        Person person = new Person("Joe Bloggs");
        System.out.println(person);
        person.speak();
        System.out.println(person);
    }
}
