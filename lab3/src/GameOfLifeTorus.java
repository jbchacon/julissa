
public class GameOfLifeTorus extends GameOfLife {
    public GameOfLifeTorus() {
    }
//constructors
    public GameOfLifeTorus(int size) {
        this.size = size;
        this.board = new int[size][size];
    }

    public GameOfLifeTorus(int[][] array) {
        board = array;
        size = board.length;
        pBoard = new int[size][size];
    }
// methos from GOL class but checks neighboring cells in torus form using the modulus and size
    public int neighbors(int i, int j, int size, int board[][]) {
        int counter = 0;
        if (board[(i - 1) % size][(j - 1) % size] == 1) counter++;
        if (board[i % size][(j - 1) % size] == 1) counter++;
        if (board[(i + 1) % size][(j - 1) % size] == 1) counter++;
        if (board[(i - 1) % size][j % size] == 1) counter++;
        if (board[(i + 1) % size][j % size] == 1) counter++;
        if (board[(i - 1) % size][(j + 1) % size] == 1) counter++;
        if (board[i % size][(j + 1) % size] == 1) counter++;
        if (board[(i + 1) % size][(j + 1) % size] == 1) counter++;
        if (board[(i - 1) % size][j % size] == 1) {
            counter++;
        }
        return counter;
    }
}

