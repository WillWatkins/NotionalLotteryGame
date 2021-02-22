//Create one of each type of worker, and get them to fill the machine of a game

public class TestWorkers {

    public static void main(String[] args){
        testWorker(new Worker("MKD"), new Game("Lotto", 3, "SM", 2));
        testWorker(new TraineeWorker("DM", 0.75), new Game("13th", 5, "LOSE", 2));

    }

    private static void testWorker(Worker worker, Game game){
        System.out.println("------------------------------------");
        System.out.println("Start with");
        System.out.println(game);

        System.out.println("Balls added by ");
        System.out.println(worker);

        worker.fillMachine(game);
        System.out.println(game);
        System.out.println(worker);
    }
}
