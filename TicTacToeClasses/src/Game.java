public class Game {
    private Player player1;
    private Player player2;
    private Board board;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
    }

    public void startGame() {
        Player currentPlayer = player1;
        boolean gameOver = false;

        while (!gameOver) {
            board.displayBoard();
            currentPlayer.makeMove(board);

            if (board.checkWin(currentPlayer.getMark())) {
                board.displayBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                gameOver = true;
            } else if (board.isFull()) {
                board.displayBoard();
                System.out.println("It's a draw!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }

    public static void main(String[] args) {
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');

        Game game = new Game(player1, player2);
        game.startGame();
    }
}
