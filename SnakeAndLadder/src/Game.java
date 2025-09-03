import java.util.*;

public class Game {
    Board board;
    Player winner;
    Queue<Player> players;
    Dice dice;

    Game(int size, int numberOfSnakes, int numberOfLadder, int numberOfPlayer) {
        board = new Board(size, numberOfSnakes, numberOfLadder);
        dice = new Dice();
        addPlayer(numberOfPlayer);
    }

    public void addPlayer(int numberOfPlayer) {
        players = new ArrayDeque<>();
        for (int i = 0; i < numberOfPlayer; i++) {
            players.add(new Player("Player_" + i));
        }
    }

    public void playGame() {
        while (players.size() >= 2) {
            Player current = players.remove();
            int rollnum = dice.rollDice();
            int newPosition = current.position + rollnum;
            System.out.println(current.name + " position was " + current.position + " and roll dice gets " + rollnum
                    + " and new position becomes " + newPosition);

            while (!isWinner(newPosition) && board.getCell(newPosition).mover != null) {
                if (board.getCell(newPosition).mover.start > board.getCell(newPosition).mover.end) {
                    System.out.println(current.name + " cut by snake and new position becomes "
                            + board.getCell(newPosition).mover.end);
                } else {
                    System.out.println(current.name + " moved by ladder and new position becomes "
                            + board.getCell(newPosition).mover.end);
                }
                newPosition = board.getCell(newPosition).mover.end;
            }
            current.position = newPosition;
            if (isWinner(newPosition)) {
                System.out.println(current.name + " Winner!!!");
            } else {
                players.add(current);
            }
        }
        System.out.println(players.remove().name + " Last!!!");
    }

    public boolean isWinner(int position) {
        return position >= board.size * board.size;
    }
}
