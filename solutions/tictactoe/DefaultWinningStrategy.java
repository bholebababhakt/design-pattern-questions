package tictactoe;

public class DefaultWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Piece marker) {
        Piece[][] grid = board.getGrid();
        int size = grid.length;

        // Check rows and columns
        for (int i = 0; i < size; i++) {
            if (isWinningRow(grid, i, marker) || isWinningColumn(grid, i, marker)) {
                return true;
            }
        }
        return isWinningDiagonal(grid, marker);
    }
    private boolean isWinningRow(Piece[][] grid, int row, Piece marker) {
        for (Piece cell : grid[row]) {
            if (cell != marker) return false;
        }
        return true;
    }

    private boolean isWinningColumn(Piece[][] grid, int col, Piece marker) {
        for (Piece[] row : grid) {
            if (row[col] != marker) return false;
        }
        return true;
    }

    private boolean isWinningDiagonal(Piece[][] grid, Piece marker) {
        int size = grid.length;
        boolean mainDiagonal = true, antiDiagonal = true;

        for (int i = 0; i < size; i++) {
            if (grid[i][i] != marker) mainDiagonal = false;
            if (grid[i][size - i - 1] != marker) antiDiagonal = false;
        }

        return mainDiagonal || antiDiagonal;
    }

}
