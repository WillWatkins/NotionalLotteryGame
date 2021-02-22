//Representation of a lottery game, comprising a machine and a rack.

public class Game {

    //The machine for the game
    private final Machine machine;

    //The rack for the game
    private final Rack rack;

    //Constructor takes name ans ize of the machine and the rack.
    public Game(String machineName, int machineSize, String rackName, int rackSize){
        machine = new Machine(machineName, machineSize);
        rack = new Rack(rackName, rackSize);
    }

    //Return size of the machine
    public int getMachineSize() {
        return machine.getSize();
    }

    //Return size of the rack
    public int getRackSize(){
        return rack.getSize();
    }

    //Return the number of balls in the rack
    public int getRackNoOfBalls(){
        return rack.getNoOfBalls();
    }

    //Add a ball into the machine
    public void machineAddBall(Ball ball){
        machine.addBall(ball);
    }

    //Eject a ball from the machine that now goes into the rack.
    //Also return the rejected ball
    public Ball ejectBall(){
        if (machine.getNoOfBalls() > 0 && rack.getNoOfBalls() < rack.getSize()){
            Ball ejectedBall = machine.ejectBall();
            rack.addBall(ejectedBall);
            return  ejectedBall;
        }
        else
            return null;
    }

    //Returns true if and only if the rack contains a Ball with a given number.
    public boolean rackContains(int value){
        return rack.contains(value);
    }

    //Sorts the balls in the Rack into ascending order.
    public void rackSortBalls(){
        rack.sortBalls();
    }

    //Mainly for testing
    public String toString(){
        return String.format("%s%n%s", machine, rack);
    }





}
