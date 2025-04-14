package tictactoe;

public interface WinningStrategy {
    boolean checkWinner(Board board, Piece marker);
}
