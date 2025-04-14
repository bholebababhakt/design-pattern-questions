package tictactoe;

import java.util.List;

public class Game {
    private static Game instance;
    private Board board;
    private List<Player> players;
    private GameState state;
    private WinningStrategy winningStrategy;
    private int currentPlayerIndex;

    private Game(List<Player> players, int size) {
        this.board = new Board(size);
        this.players = players;
        this.state = GameState.IN_PROGRESS;
        this.winningStrategy = new DefaultWinningStrategy();
        this.currentPlayerIndex = 0;
    }

    public static synchronized Game getInstance(List<Player> players, int size) {
        if (instance == null) {
            return new Game(players, size);
        }
        return instance;
    }

    public void playTurn(int row, int col) {
        if (state != GameState.IN_PROGRESS) {
            System.out.println("Game Over!");
            return;
        }

        Player currentPlayer = players.get(currentPlayerIndex);
        boolean moveMade = board.placeMarker(row, col, currentPlayer.getPiece());

        if (!moveMade) {
            System.out.println("Invalid move! Try again.");
            return;
        }

        if (winningStrategy.checkWinner(board, currentPlayer.getPiece())) {
            state = GameState.WIN;
            System.out.println(currentPlayer.getName() + " Wins!");
            return;
        }

        if (board.isFull()) {
            state = GameState.DRAW;
            System.out.println("It's a draw!");
            return;
        }

        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
