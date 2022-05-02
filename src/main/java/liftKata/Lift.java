package liftKata;

import java.util.*;
public class Lift {
    private int currentFloor;
    private boolean waitingForRequest;
    private List<Integer> callQueue = new ArrayList<Integer>();
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
        else{
            callQueue.add(floor);
        }
    }
    public void request(int floor){
        currentFloor = floor;
        waitingForRequest = false;
    }
}
