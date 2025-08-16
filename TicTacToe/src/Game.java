import java.util.*;

public class Game {
    Deque<Player> players;
    Board board;

    Game() {
        players = new ArrayDeque<>();
        initialiseGame();
    }

    public void initialiseGame() {
        PieceX pieceX = new PieceX();
        PieceO pieceO = new PieceO();
        Player p1 = new Player("P1", pieceX);
        Player p2 = new Player("P2", pieceO);
        players.add(p1);
        players.add(p2);
        board = new Board(3);
    }

    public void startGame() {
        boolean isWinner = false;
        while (!isWinner) {
            Player currentPlayer = players.removeLast();
            Scanner sc = new Scanner(System.in);
            board.printBoard();
            System.out.println("Current Turn: " + currentPlayer.name);
            System.out.print("Enter row and column:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            boolean isAddPiece = board.addPiece(currentPlayer.playingPiece, row, col);
            if (!isAddPiece) {
                System.out.println("invalid row and column");
                players.addLast(currentPlayer);
                // sc.close();
                continue;
            }
            isWinner = findWinner(currentPlayer);
            if (isWinner) {
                System.out.println(currentPlayer.name + " wins!");
                // sc.close();
                return;
            }
            players.addFirst(currentPlayer);
            if (!board.isEmptySpace()) {
                sc.close();
                break;
            }
            // sc.close();
        }
        System.out.println("Game Tie");
    }

    public boolean findWinner(Player player) {
        for (int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++) {
                if (board.board[i][j] != player.playingPiece) {
                    break;
                }
                if (j == board.size - 1) {
                    return true;
                }
            }
        }
        for (int j = 0; j < board.size; j++) {
            for (int i = 0; i < board.size; i++) {
                if (board.board[i][j] != player.playingPiece) {
                    break;
                }
                if (i == board.size - 1) {
                    return true;
                }
            }
        }
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][i] != player.playingPiece) {
                break;
            }
            if (i == board.size - 1) {
                return true;
            }
        }
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][board.size - i - 1] != player.playingPiece) {
                break;
            }
            if (i == board.size - 1) {
                return true;
            }
        }
        return false;
    }
}
