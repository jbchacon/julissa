public class GameOfLife {
    //attributes
    int size;
    int[][] board;
    int[][] pBoard;

    //default constructor
    public GameOfLife() {
    }

    //constructors
    public GameOfLife(int size) {
        this.size = size;
        this.board = new int[size][size];
    }


    public GameOfLife(int[][] array) {
        board = array;
        size = board.length;
        pBoard = new int[size][size];
    }

    public int[][] getBoard() {
        return board;
    }
//checks if cell is dead or alive
    public void oneStep() {
        int[][] nextBoard = new int[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int alive = neighbors(i, j);
                if (board[i][j] == 1) {//all ones are alive
                    if (alive < 2) {
                        pBoard[i][j] = 0;//all zeros are dead
                    } else if (alive == 2 || alive == 3) {
                        pBoard[i][j] = 1;
                    } else if (alive > 3) {
                        pBoard[i][j] = 0;
                    } else {
                        if (alive == 3) {
                            pBoard[i][j] = 1;
                        }
                    }
                }
            }
        }

        this.board = pBoard;
        this.board = nextBoard;//updates board
    }

// this method checks all the neighboring cells and counts them
    public int neighbors(int i, int j) {
        int counter = 0;
        if (board[i - 1][j - 1] == 1) counter++;
        if (board[i][j - 1] == 1) counter++;
        if (board[i + 1][j - 1] == 1) counter++;
        if (board[i - 1][j] == 1) counter++;
        if (board[i + 1][j] == 1) counter++;
        if (board[i - 1][j + 1] == 1) counter++;
        if (board[i][j + 1] == 1) counter++;
        if (board[i + 1][j + 1] == 1) counter++;


        return counter;
    }
//
    public void evolution(int n) {
        int eCounter = 0;
        while (n <= eCounter) {
            oneStep();
            eCounter++;
        }
    }

}
//https://stackoverflow.com/questions/20842078/john-conways-game-of-life
// I also went to office hours
