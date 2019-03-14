import org.junit.Test;

import static org.junit.Assert.*;

public class MovementTest {

    @Test
    public void directionHandlerTest () {
        Movement direction = new Movement();
        assertEquals(direction.directionHandler(360),'N' );
        assertEquals(direction.directionHandler(450),'E' );
        assertEquals(direction.directionHandler(90),'E' );
        assertEquals(direction.directionHandler(0),'N' );
    }

    @Test
    public void allowedPositionHandler () {
        Movement position = new Movement();
        int[] forbiddenPosition = {5,7};
        int[]  allowedPosition = {3,4};
        assertFalse(position.allowedPositionHandler(forbiddenPosition));
        assertTrue(position.allowedPositionHandler(allowedPosition));
    }

    @Test
    public void movementHandlerTest (){
        Movement movement = new Movement();
        int[][] playerPositionCoordinates = {{2,3},{4,4}};
        char[] directionBuffer = {'N','E'};
        int[][] finalPosition = {{2,4},{4,4}};
        assertArrayEquals(movement.movementHandler(playerPositionCoordinates[0], directionBuffer[0]), finalPosition[0]);
        assertArrayEquals(movement.movementHandler(playerPositionCoordinates[1], directionBuffer[1]), finalPosition[1]);

    }
}