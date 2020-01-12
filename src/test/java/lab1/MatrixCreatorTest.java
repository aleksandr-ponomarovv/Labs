package lab1;

import org.junit.Test;

import static lab1.MatrixCreator.discoverMax;
import static lab1.MatrixCreator.discoverMin;
import static lab1.MatrixCreator.calculateSum;
import static org.junit.Assert.*;

public class MatrixCreatorTest {

    @Test
    public void discoverMaxTest() {
        assertEquals(4, discoverMax(createMatrix()));
    }

    private int[][] createMatrix() {
        int[][] demoMatrix= {{1,2},{3,4}};
        return demoMatrix;
    }

    @Test
    public void calculateSumTest() {
        assertEquals(10, calculateSum(createMatrix()));
    }

    @Test
    public void discoverMinTest() {
        assertEquals(1, discoverMin(createMatrix()));
    }
}