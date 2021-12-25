
import org.junit.Test;


import static org.junit.Assert.*;

public class Tests {

    @Test()
    public void testExampleSimple(){
        assertArrayEquals(new int[] {0,1}, Valley.valley(new int[]{1}));
        assertArrayEquals(new int[] {1,0}, Valley.valley(new int[]{-1}));

        assertArrayEquals(new int[] {0,2}, Valley.valley(new int[]{1,1}));
        assertArrayEquals(new int[] {0,3}, Valley.valley(new int[]{1,1,1}));


        assertArrayEquals(new int[] {1,1}, Valley.valley(new int[]{1,-1}));
        assertArrayEquals(new int[] {3,0}, Valley.valley(new int[]{-1,-1,-1}));
        assertArrayEquals(new int[] {1,3}, Valley.valley(new int[]{-1,1,1,1}));
    }

    @Test()
    public void testExampleValley(){

        int[] example = new int[]{1, 1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, -1, -1};

        int[] result = Valley.valley(example);

        assertEquals(5, result[0]);


    }

    @Test()
    public void testExampleMountain(){

        int[] example = new int[]{1, 1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, -1, -1};

        int[] result = Valley.valley(example);

        assertArrayEquals(new int[] {5,6}, result);

    }

    @Test()
    public void testHeightEqualsArraySize(){

        int[] example = new int[]{1,1,1,1,1,-1,-1,-1,-1,-1};

        int[] result = Valley.valley(example);

        assertEquals(5, result[1]);
    }

    @Test()
    public void testDepthEqualsArraySize(){

        int[] example = new int[]{-1,-1,-1,-1,-1,1,1,1,1,1};

        int[] result = Valley.valley(example);

        assertEquals(5, result[0]);
    }


}
