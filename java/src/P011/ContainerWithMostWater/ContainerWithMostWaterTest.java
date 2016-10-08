package P011.ContainerWithMostWater;

import org.junit.Test;

import static org.junit.Assert.*;
import static P011.ContainerWithMostWater.ContainerWithMostWater.maxArea;

public class ContainerWithMostWaterTest {
    @Test
    public void maxAreaTest() throws Exception {
        int[] height = new int[] {1, 2, 3, 4};
        assertEquals(maxArea(height), 4);
    }

}