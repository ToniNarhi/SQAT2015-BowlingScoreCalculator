package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
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


}
