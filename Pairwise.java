import java.util.*;

/*
 *  Pairwise class for computing pairwise combinations
 */
public class Pairwise {
    
    private static ArrayList<int[]> pairwiseTable;
    
    /**
     * This method executes the program
     * @param args - console input
     */
    public static void main(String[] args) {
        pairwiseTable = null;
        if (args.length >= 2) {
            int n = args.length;
            ArrayList<int[]> exhaustiveTable = getExhaustiveTable(n);
            pairwiseTable = generatePairwiseTable(new ArrayList<int[]>(),exhaustiveTable);
            display(args,pairwiseTable);
        } else {
            System.out.println("Please enter at least two parameters!");
            System.exit(0);
        }
    }
    
    /*
     *  This method gets the exhaustive table of combinations
     *  @param n - number of elements
     */
    private static ArrayList<int[]> getExhaustiveTable(int n) {
        int[][] table = new int[(int)Math.pow(2,n)][n];
        for (int row = 1; row < table.length; row++) {
            int carry = 1;
            for (int index = n - 1; index >= 0; index--) {
                table[row][index] = table[row - 1][index] + carry;
                carry = 0;
                if (table[row][index] == 2) {
                    table[row][index] = 0;
                    carry = 1;
                }
            }
        }
        ArrayList<int[]> result = new ArrayList<int[]>();
        for (int[] row: table) {
            result.add(0, row);
        }
        return result;
    }
    
    /*
     *  This method displays a table
     *  @param params - element names
     *  @param table - table
     */
    private static void display(String[] params, ArrayList<int[]> table) {
        if (table == null) {
            return;
        }
        String format = "";
        for (int i = 0; i < params.length; i++) {
            format += "%-7s";
        }
        System.out.format(format,(Object[])params);
        System.out.println();
        for (int[] row: table) {
            for (int element: row) {
                System.out.print(element + "      ");
            }
            System.out.println();
        }
    }
    
    /*
     *  This method checks if all pairwise combations are present
     *  @param table - table
     */
    private static boolean checkPairwise(ArrayList<int[]> table) {
        if (table.size() == 0) {
            return false;
        }
        int n = table.get(0).length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean[] combinations = {false, false, false, false};
                for (int[] row: table) {
                    if (row[i] == 0 && row[j] == 0) {
                        combinations[0] = true;
                    } else if (row[i] == 0 && row[j] == 1) {
                        combinations[1] = true;
                    } else if (row[i] == 1 && row[j] == 0) {
                        combinations[2] = true;
                    } else if (row[i] == 1 && row[j] == 1) {
                        combinations[3] = true;
                    }
                }
                for (boolean combination: combinations) {
                    if (combination != true) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    /*
     *  This method generates table combinations, checking for pairwise combinations
     *  @param table - table
     *  @param other - remaining rows
     */
    private static ArrayList<int[]> generatePairwiseTable(ArrayList<int[]> table, ArrayList<int[]> other) {
        if (checkPairwise(table)) {
            return table;
        }
        if (other.isEmpty()) {
            return null;
        }
        if (pairwiseTable != null && table.size() >= pairwiseTable.size()) {
            return null;
        }
        for (int i = 0; i < other.size(); i++) {
            ArrayList<int[]> newTable = new ArrayList<int[]>(table);
            newTable.add(other.get(i));
            ArrayList<int[]> newOther = new ArrayList<int[]>(other.subList(i + 1,other.size()));
            ArrayList<int[]> result = generatePairwiseTable(newTable, newOther);
            if (result != null) {
                if (pairwiseTable == null || result.size() < pairwiseTable.size()) {
                    pairwiseTable = result;
                }
            }
        }
        return pairwiseTable;
    }
    
}

