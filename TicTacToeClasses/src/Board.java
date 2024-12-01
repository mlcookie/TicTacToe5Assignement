public class Board {
    private char[][] grid;

    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' '; // Initialize all cells as empty
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + grid[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    public boolean updateCell(int row, int col, char mark) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == ' ') {
            grid[row][col] = mark;
            return true;
        }
        return false;
    }

    public boolean checkWin(char mark) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == mark && grid[i][1] == mark && grid[i][2] == mark) || 
                (grid[0][i] == mark && grid[1][i] == mark && grid[2][i] == mark)) {
                return true;
            }
        }

        // Check diagonals
        return (grid[0][0] == mark && grid[1][1] == mark && grid[2][2] == mark) || 
               (grid[0][2] == mark && grid[1][1] == mark && grid[2][0] == mark);
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
