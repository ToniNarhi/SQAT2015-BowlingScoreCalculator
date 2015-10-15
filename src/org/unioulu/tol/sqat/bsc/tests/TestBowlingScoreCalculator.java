package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Frame frame = new Frame(2,4);
		//assertEquals(2,4, frame);
		//assertThat(frame, matches(2,4));
	}
	@Test
	public void testFrameScoreIsAddedCorrectly() {
		Frame frame = new Frame(2,4);
		assertEquals(6,frame.score());
	}
	@Test
	public void testIfGameHas10Frames() {
		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		assertEquals(10,bowlinggame.Getframes().size());
	}
	
	@Test
	public void testIfGameScoreIsCorrect() {
		Frame frame1 = new Frame(1,5); //6
		Frame frame2 = new Frame(3,6); //9
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(2,6); //8
										//15,24,33,41,49,55,64,73,81
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		
		assertEquals(81, bowlinggame.score());
	}
	
	@Test
	public void testIfStrikeScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(10,0); //6
		Frame frame2 = new Frame(3,6); //9
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(2,6); //8
										//85
										//+next Frame
										//=94
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		
		assertEquals(94, bowlinggame.score());
	}
	
	@Test
	public void testIfSpareScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(10,0); //10
		Frame frame2 = new Frame(4,6); //10
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(2,6); //8
										//85
										//+next throw
										//=103
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		
		assertEquals(103, bowlinggame.score());
	}
	
	@Test
	public void testIfTwoStrikersInARowScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(10,0); //10
		Frame frame2 = new Frame(10,0); //10
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(2,6); //8
										//85
										//+next throw
										//=112
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		
		assertEquals(112, bowlinggame.score());
	}
	@Test
	public void testIfTwoSpareInARowScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(8,2); //10
		Frame frame2 = new Frame(5,5); //10
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(2,6); //8
										//85
										//+next throw
										//=98
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		
		assertEquals(98, bowlinggame.score());
	}
	
	@Test
	public void testIfLastFrameIsSpareScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(1,5); //10
		Frame frame2 = new Frame(3,6); //10
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(2,8); //8
										//85
										//+next throw
										//=98
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		
		assertEquals(90, bowlinggame.score());
	}
	
	@Test
	public void testIfLastFrameIsStrikeScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(1,5); //10
		Frame frame2 = new Frame(3,6); //10
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(10,0); //8
		Frame frame11 = new Frame(10,0);								//85
										//+next throw
										//=92
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		bowlinggame.addFrame(frame11);
		
		assertEquals(93, bowlinggame.score());
	}
	@Test
	public void testIfBestScoreScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(10,0); //10
		Frame frame2 = new Frame(10,0); //10
		Frame frame3 = new Frame(10,0); //9
		Frame frame4 = new Frame(10,0); // 9
		Frame frame5 = new Frame(10,0); //8
		Frame frame6 = new Frame(10,0); // 8
		Frame frame7 = new Frame(10,0); //6
		Frame frame8 = new Frame(10,0); // 9
		Frame frame9 = new Frame(10,0); //9
		Frame frame10 = new Frame(10,0); //8
		Frame frame11 = new Frame(10,0);								//85
										//+next throw
										//=92
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		bowlinggame.addFrame(frame11);
		
		assertEquals(93, bowlinggame.score());
	}
	
	@Test
	public void testIfBonusIsStrikeScoreisCalculatedCorrectly() {
		Frame frame1 = new Frame(1,5); //10
		Frame frame2 = new Frame(3,6); //10
		Frame frame3 = new Frame(7,2); //9
		Frame frame4 = new Frame(3,6); // 9
		Frame frame5 = new Frame(4,4); //8
		Frame frame6 = new Frame(5,3); // 8
		Frame frame7 = new Frame(3,3); //6
		Frame frame8 = new Frame(4,5); // 9
		Frame frame9 = new Frame(8,1); //9
		Frame frame10 = new Frame(2,8); //8
										//85
										//+next throw
										//=93
		BowlingGame bowlinggame = new BowlingGame();
		bowlinggame.addFrame(frame1);
		bowlinggame.addFrame(frame2);
		bowlinggame.addFrame(frame3);
		bowlinggame.addFrame(frame4);
		bowlinggame.addFrame(frame5);
		bowlinggame.addFrame(frame6);
		bowlinggame.addFrame(frame7);
		bowlinggame.addFrame(frame8);
		bowlinggame.addFrame(frame9);
		bowlinggame.addFrame(frame10);
		
		assertEquals(92, bowlinggame.score());
	}
	
	
	
}
