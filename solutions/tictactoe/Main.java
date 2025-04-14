package tictactoe;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Alice", Piece.X);
        Player p2 = new Player("Bob", Piece.O);

        Game game = Game.getInstance(Arrays.asList(p1, p2), 3);

        game.playTurn(0, 0); // Alice
        game.playTurn(1, 0); // Bob
        game.playTurn(0, 1); // Alice
        game.playTurn(1, 1); // Bob
        game.playTurn(0, 2);
    }
}
