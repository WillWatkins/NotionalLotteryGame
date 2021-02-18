//Create an audience member class and make them speak
//For testing purposes only.
public class TestAudienceMember {

    public static void main(String[] args){
        AudienceMember audienceMember = new AudienceMember("Jane Doe");
        System.out.println(audienceMember);
        audienceMember.speak();
        System.out.println(audienceMember);

    }
}
