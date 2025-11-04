package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
 import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Tests the functionality of the Board class, ensuring that various methods.
 */
public class BoardTest {
    
    /**
     * Tests Board with single square, ensures retrieved correctly.
     */
    @Test
    void testBoardOneSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isNotNull();
        assertThat(board.squareAt(0, 0)).isInstanceOf(BasicSquare.class);
    }
    
//     /**
//      * Tests Board with null square, verifies invariant is false.
//      */
//     @Test
//     void testBoardNullSquare() {
//         Square[][] grid = new Square[1][1];
//         grid[0][0] = null;
//         Board board = new Board(grid);
//
//         assertThat(board.invariant()).isFalse();
//         assertThrows(NullPointerException.class, () -> board.squareAt(0, 0).getOccupants());
//     }
}
