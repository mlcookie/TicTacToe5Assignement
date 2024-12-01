public class App {
    public static void main(String[] args) {
        // Create players
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');

        // Initialize and start the game
        Game game = new Game(player1, player2);
        game.startGame();
    }
}
