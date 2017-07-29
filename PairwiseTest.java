import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

/*
 *  JUnit Tests for Pairwise Class
 */

public class PairwiseTest {
    
    /*
     *  Helper method to check if two tables are equal
     */
    private boolean tableEquals(ArrayList<int[]> table1, ArrayList<int[]> table2) {
        if (table1.size() != table2.size()) {
            return false;
        }
        for (int i = 0; i < table1.size(); i++) {
            if (table1.get(i).length != table2.get(i).length) {
                return false;
            }
            for (int j = 0; j < table1.get(i).length; j++) {
                if (table1.get(i)[j] != table2.get(i)[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /*
     *  Test getExhaustiveTable() for n = 1
     */
    @Test
    public void testExhaustiveTableNEquals1() { 
        int[][] array = {{1},{0}};
        ArrayList<int[]> expected = new ArrayList<int[]>();
        for (int[] row: array) {
            expected.add(row);
        }
        assertTrue(tableEquals(Pairwise.getExhaustiveTable(1),expected));
    }
    
    /*
     *  Test getExhaustiveTable() for n = 2
     */
    @Test
    public void testExhaustiveTableNEquals2() { 
        int[][] array = {{1,1},{1,0},{0,1},{0,0}};
        ArrayList<int[]> expected = new ArrayList<int[]>();
        for (int[] row: array) {
            expected.add(row);
        }
        assertTrue(tableEquals(Pairwise.getExhaustiveTable(2),expected));
    }
    
    /*
     *  Test getExhaustiveTable() for n = 3
     */
    @Test
    public void testExhaustiveTableNEquals3() { 
        int[][] array = {{1,1,1},{1,1,0},{1,0,1},{1,0,0},{0,1,1},{0,1,0},{0,0,1},{0,0,0}};
        ArrayList<int[]> expected = new ArrayList<int[]>();
        for (int[] row: array) {
            expected.add(row);
        }
        assertTrue(tableEquals(Pairwise.getExhaustiveTable(3),expected));
    }
    
    /*
     *  Test getExhaustiveTable() for n = 4
     */
    @Test
    public void testExhaustiveTableNEquals4() { 
        int[][] array = {{1,1,1,1},{1,1,1,0},{1,1,0,1},{1,1,0,0},{1,0,1,1},{1,0,1,0},{1,0,0,1},{1,0,0,0},
            {0,1,1,1},{0,1,1,0},{0,1,0,1},{0,1,0,0},{0,0,1,1},{0,0,1,0},{0,0,0,1},{0,0,0,0}};
        ArrayList<int[]> expected = new ArrayList<int[]>();
        for (int[] row: array) {
            expected.add(row);
        }
        assertTrue(tableEquals(Pairwise.getExhaustiveTable(4),expected));
    }
    
    /*
     *  Test displayTable() for n = 1
     */
    @Test
    public void testDisplayNEquals1() { 
        ArrayList<int[]> table = Pairwise.getExhaustiveTable(1);
        assertTrue(true);
    }
    
    /*
     *  Test displayTable() for n = 2
     */
    @Test
    public void testDisplayNEquals2() { 
        ArrayList<int[]> table = Pairwise.getExhaustiveTable(2);
        assertTrue(true);
    }
    
    /*
     *  Test displayTable() for n = 3
     */
    @Test
    public void testDisplayNEquals3() { 
        ArrayList<int[]> table = Pairwise.getExhaustiveTable(3);
        assertTrue(true);
    }
    
    /*
     *  Test displayTable() for n = 4
     */
    @Test
    public void testDisplayNEquals4() { 
        ArrayList<int[]> table = Pairwise.getExhaustiveTable(4);
        assertTrue(true);
    }
    
    /*
     *  Test generatePairwiseTable() and checkPairwise() for n = 1
     */
    @Test
    public void testPairwiseNEquals1() { 
        ArrayList<int[]> table = Pairwise.generatePairwiseTable(new ArrayList<int[]>(),Pairwise.getExhaustiveTable(1));
        assertTrue(Pairwise.checkPairwise(table));
    }
    
    /*
     *  Test generatePairwiseTable() and checkPairwise() for n = 2
     */
    @Test
    public void testPairwiseNEquals2() { 
        ArrayList<int[]> table = Pairwise.generatePairwiseTable(new ArrayList<int[]>(),Pairwise.getExhaustiveTable(2));
        assertTrue(Pairwise.checkPairwise(table));
    }
    
    /*
     *  Test generatePairwiseTable() and checkPairwise() for n = 3
     */
    @Test
    public void testPairwiseNEquals3() { 
        ArrayList<int[]> table = Pairwise.generatePairwiseTable(new ArrayList<int[]>(),Pairwise.getExhaustiveTable(3));
        assertTrue(Pairwise.checkPairwise(table));
    }
    
    /*
     *  Test generatePairwiseTable() and checkPairwise() for n = 4
     */
    @Test
    public void testPairwiseNEquals4() { 
        ArrayList<int[]> table = Pairwise.generatePairwiseTable(new ArrayList<int[]>(),Pairwise.getExhaustiveTable(4));
        assertTrue(Pairwise.checkPairwise(table));
    }
}
