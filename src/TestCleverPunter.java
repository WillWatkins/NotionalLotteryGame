//Given a machine size and a rack size from the first two arguments,
//create a game and a clever punter to play it.
//reporting result as eject each ball

public class TestCleverPunter {

    public static void main(String[] args){
        int machineSize = Integer.parseInt(args[0]);
        int rackSize = Integer.parseInt(args[1]);

        Game game = new Game("Lotto", machineSize, "Rack", rackSize);
        Worker worker = new Worker("Worker");
        worker.fillMachine(game);

        CleverPunter cleverPunter = new CleverPunter("CleverPunterName");
        System.out.println(cleverPunter);
        cleverPunter.speak();
        System.out.println(cleverPunter);

        cleverPunter.setGame(game);
        cleverPunter.speak();
        System.out.println(cleverPunter);
        for (int count = 1; count <= game.getRackSize(); count++){
            System.out.println("Ejected: " + game.ejectBall().getValue());
            cleverPunter.speak();
            System.out.println(cleverPunter.isHappy() + " " + cleverPunter.getCurrentSaying());
        }
    }
}
