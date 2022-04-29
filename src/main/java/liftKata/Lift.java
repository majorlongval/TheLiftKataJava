package liftKata;

public class Lift {
    private int currentFloor;
    private boolean waitingForRequest;
    public Lift(){
        currentFloor = 0;
        waitingForRequest = false;
    }
    public int floor(){
        return currentFloor;
    }
    public void call(int floor, boolean direction){
        if (! waitingForRequest){
            currentFloor = floor;
            waitingForRequest = true;
        }
    }
    public void request(int floor){
        currentFloor = floor;
        waitingForRequest = false;
    }
}
