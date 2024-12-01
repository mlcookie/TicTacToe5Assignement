import java.util.Scanner;

public class Player {
    private String name;
    private char mark;

    public Player(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public char getMark() {
        return mark;
    }

    public void makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println(name + " (" + mark + "), enter your move (row and column, 0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (board.updateCell(row, col, mark)) {
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}
