package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Basic implementation of board.
 *
 * @author Jeroen Roosen 
 */
public class BoardTest {
    /**
    * Test board with one square (valid)
    */
    @Test
    void testBoardOneSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isNotNull();
        assertThat(board.squareAt(0, 0)).isInstanceOf(BasicSquare.class);
    }
    /**
    * Test board with null square, squareAt method
    */
    @Test
    void testBoardNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        Board board = new Board(grid);

        assertThat(board.invariant()).isFalse();
        assertThrows(NullPointerException.class, () -> board.squareAt(0,0).getOccupants());
    }
}
