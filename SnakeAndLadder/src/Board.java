import java.util.*;

public class Board {
    Cell[][] cells;
    int size;

    Board(int size, int numberOfSnakes, int numberOfLadder) {
        this.size = size;
        initialiseBoard(size);
        addSnakeLadder(numberOfSnakes, numberOfLadder, size);
    }

    public void initialiseBoard(int size) {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell(null);
                cells[i][j] = cell;
            }
        }
    }

    public void addSnakeLadder(int numberOfSnakes, int numberOfLadder, int size) {
        Random random = new Random();
        while (numberOfSnakes > 0) {
            int newStart = random.nextInt(size * size - 1);
            int newEnd = random.nextInt(size * size - 1);
            if (newStart <= newEnd) {
                continue;
            }
            Mover mover = new Snake(newStart, newEnd);
            Cell cell = getCell(newStart);
            cell.mover = mover;
            numberOfSnakes--;
        }
        while (numberOfLadder > 0) {
            int newStart = random.nextInt(size * size - 1);
            int newEnd = random.nextInt(size * size - 1);
            if (newStart >= newEnd) {
                continue;
            }
            Mover mover = new Ladder(newStart, newEnd);
            Cell cell = getCell(newStart);
            cell.mover = mover;
            numberOfLadder--;
        }
    }

    public Cell getCell(int position) {
        return cells[position / size][position % size];
    }
}
