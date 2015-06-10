import org.junit.*;

import junit.framework.TestCase;


public class BoardTest extends TestCase{
	

	
	Board board = new Board();
	
	@Test
	public void leeresboard(){
		assertTrue(board.boardIsEmpty());
	}
	
	@Test
	public void gueltigeMarkOhneGewinner() throws InvalidPositionException{
		//board.setMark("X",0,0);
	}
	
	@Test 
	public void gueltigeMarkMitGewinner() throws InvalidPositionException{
		board.setMark("X",0,0);
		board.setMark("X",0,1);
		board.setMark("X",0,2);
		assertTrue(board.hasWinner());
	}
	
	@Test (expected = InvalidPositionException.class)
	public void ungueltigeMark(){
		board.setMark("X",0,6);
	}
}
