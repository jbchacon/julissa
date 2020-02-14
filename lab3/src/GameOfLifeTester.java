import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class GameOfLifeTester {
    GameOfLife sol = new GameOfLife();
    int[][] b1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
    int[][] b2 = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 1, 1, 1, 0}, {0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int[][] b3 = {{0, 0, 0, 0, 0, 0}, {0, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 0, 0}, {0, 0, 0, 1, 1, 0}, {0, 0, 0, 1, 1, 0}, {0, 0, 0, 0, 0, 0}};

    @Test
    public void evolution() {
        GameOfLife sol = new GameOfLife(b2);
        sol.evolution(3);
        assertArrayEquals(b2, sol.getBoard());
    }

    @Test
    public void evolution2() {
        GameOfLife sol = new GameOfLife(b1);
        sol.evolution(7);
        assertArrayEquals(b1, sol.getBoard());
    }

    @Test
    public void evolution3() {
        GameOfLife sol = new GameOfLife(b3);
        sol.evolution(2);
        assertArrayEquals(b3, sol.getBoard());
    }

    @Test
    public void evolution4() {
        GameOfLife sol = new GameOfLife(b1);
        sol.evolution(1);
        assertArrayEquals(b1, sol.getBoard());
    }

    @Test
    public void evolution5() {
        GameOfLife sol = new GameOfLife(b2);
        sol.evolution(0);
        assertArrayEquals(b2, sol.getBoard());
    }


    @Test
    public void neighbors1() {
        GameOfLife sol = new GameOfLife(b1);
        int B = 0;
        assertEquals(B, sol.neighbors(1, 1));

    }

    @Test
    public void neighbors2() {
        GameOfLife sol = new GameOfLife(b2);
        int B = 2;
        assertEquals(B, sol.neighbors(2, 0));

    }

    @Test
    public void neighbors3() {
        GameOfLife sol = new GameOfLife(b3);
        int B = 1;
        assertEquals(B, sol.neighbors(1, 2));

    }

    @Test
    public void neighbors4() {
        GameOfLife sol = new GameOfLife(b2);
        int B = -1;
        assertEquals(B, sol.neighbors(0, 2));

    }

    @Test
    public void neighbors5() {
        GameOfLife sol = new GameOfLife(b2);
        int B = 4;
        assertEquals(B, sol.neighbors(3, 3));

    }


    //@Test
    //public void oneStep() {
    //    GameOfLife sol = new GameOfLife(b1);
    //   sol.oneStep();
    //   assertArrayEquals(B, sol.getBoard());

    // }

    // @Test
    /*public void oneStep2() {
        GameOfLife sol = new GameOfLife(b1);
        sol.oneStep(4);
        assertArrayEquals(b1, sol.getBoard());
    }
*/
    @Test
    public void evolution6() {
        GameOfLifeTorus sol = new GameOfLifeTorus(b1);
        sol.evolution(3);
        assertArrayEquals(b1, sol.getBoard());
    }

    @Test
    public void evolution7() {
        GameOfLifeTorus sol = new GameOfLifeTorus(b3);
        sol.evolution(3);
        assertArrayEquals(b3, sol.getBoard());
    }

    @Test
    public void evolution8() {
        GameOfLifeTorus sol = new GameOfLifeTorus(b1);
        sol.evolution(7);
        assertArrayEquals(b1, sol.getBoard());
    }

    @Test
    public void evolution9() {
        GameOfLifeTorus sol = new GameOfLifeTorus(b2);
        sol.evolution(6);
        assertArrayEquals(b2, sol.getBoard());
    }

    @Test
    public void evolution10() {
        GameOfLife sol = new GameOfLife(b1);
        sol.evolution(-4);
        assertArrayEquals(b1, sol.getBoard());
    }

    @Test
    public void neighbors6() {
        GameOfLifeTorus sol = new GameOfLifeTorus(b3);
        int B = 0;
        assertEquals(B, sol.neighbors(1, 1));

    }

    @Test
    public void neighbors7() {
        GameOfLifeTorus sol = new GameOfLifeTorus(b2);
        int B = 3;
        assertEquals(B, sol.neighbors(3, 4));

    }

    @Test
    public void neighbors8() {
        GameOfLife sol = new GameOfLife(b3);
        int B = 0;
        assertEquals(B, sol.neighbors(1, 2));

    }

    @Test
    public void neighbors9() {
        GameOfLife sol = new GameOfLife(b2);
        int B = 8;
        assertEquals(B, sol.neighbors(4, 2));

    }

    @Test
    public void neighbors10() {
        GameOfLife sol = new GameOfLife(b2);
        int B = 9;
        assertEquals(B, sol.neighbors(3, 3));

    }
    @Test
    public void oneStep(){
        int[][]A={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        GameOfLifeTorus x = new GameOfLifeTorus(A);
                x.oneStep();
                assertArrayEquals(b1,x.getBoard());
    }
    @Test
    public void oneStep2(){
        int[][]A={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,1}};
        GameOfLifeTorus x = new GameOfLifeTorus(A);
        x.oneStep();
        assertArrayEquals(b2,x.getBoard());
    }
    @Test
    public void oneStep3(){
        int[][]A={{0,0,0,1,0},{0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        GameOfLifeTorus x = new GameOfLifeTorus(A);
        x.oneStep();
        assertArrayEquals(b3,x.getBoard());
    }
    @Test
    public void oneStep4(){
        int[][]A={{0,0,0,0,0},{0,0,0,0,1},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        GameOfLifeTorus x = new GameOfLifeTorus(A);
        x.oneStep();
        assertArrayEquals(b1,x.getBoard());
    }
    @Test
    public void oneStep5(){
        int[][]A={{0,1,0,0,0},{0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        GameOfLifeTorus x = new GameOfLifeTorus(A);
        x.oneStep();
        assertArrayEquals(b1,x.getBoard());
    }

}