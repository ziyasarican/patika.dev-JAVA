public class Main {
    
    public static void main(String[] args) {
        // write your code here
        String[][] design = new String[6][4];
        for (int i = 0; i < design.length; i++) {
            for (int j = 0; j < design[i].length; j++) {
                if (i == 0 || i == 2 || i == 5)
                    design[i][j] = " * ";
                else if (j == 0 || j == 3)
                    design[i][j] = " * ";
                else
                    design[i][j] = "   ";
            }
        }
        for (String[] row : design) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
