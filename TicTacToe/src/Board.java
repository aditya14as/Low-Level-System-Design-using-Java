public class Board {
    int size;
    PlayingPiece[][] board;
    int totalFilled;

    Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
        totalFilled = 0;
    }

    public boolean addPiece(PlayingPiece playingPiece, int i, int j) {
        if (i < 0 || j < 0 || i >= size || j >= size) {
            return false;
        }
        if (board[i][j] != null) {
            return false;
        }
        board[i][j] = playingPiece;
        totalFilled++;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("__");
                } else {
                    System.out.print(board[i][j].pieceType);
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }

    public boolean isEmptySpace() {
        if (totalFilled == size * size) {
            return false;
        }
        return true;
    }
}
