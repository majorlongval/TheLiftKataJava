package liftKata;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;

import liftKata.Lift;

public class LiftTest {
    private Lift lift = new Lift();
    private final boolean ANY_DIRECTION = true;
    private final boolean GOING_UP = true;
    private final boolean GOING_DOWN = false;
    @Before public void initialize(){
    }

    @Test
    public void lift_ShouldInitiallyBeAtFloor0() {
        Assert.assertEquals(lift.floor(), 0);
    }

    @Test
    public void callingLift_ShouldBringItAtMyFloor(){
        lift.call(1, ANY_DIRECTION);

        Assert.assertEquals(lift.floor(), 1);
    }

    @Test
    public void requestingAfterCallingALift_ShouldMoveToRequestedFloor(){
        lift.call(1, ANY_DIRECTION);

        lift.request(2);

        Assert.assertEquals(lift.floor(), 2);
    }

    @Test
    public void callingACalledLift_ShouldWaitForARequest() {
        lift.call(1, ANY_DIRECTION);

        lift.call(2, ANY_DIRECTION);

        Assert.assertEquals(lift.floor(), 1);

    }
}