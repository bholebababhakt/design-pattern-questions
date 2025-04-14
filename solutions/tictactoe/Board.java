package tictactoe;

public class Board {
    private Piece[][] grid;
    private int size;

    public Board(int size) {
        this.grid = new Piece[size][size];
        this.size = size;
    }
    public boolean placeMarker(int row, int col, Piece piece){
        if (row < 0 || col < 0 || row >= size || col >= size || grid[row][col] != null) {
            System.out.println("can't put mark at that place");
            return false;
        }
        grid[row][col] = piece;
        return true;
    }
    public boolean isFull() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (grid[i][j] == null) return false;
        return true;
    }

    public Piece[][] getGrid() {
        return grid;
    }
}
