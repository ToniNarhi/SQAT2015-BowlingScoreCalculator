package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
	frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int TotalScore = 0;
		for(int i = 0; i < frames.size(); i++)
		{
		TotalScore += frames.get(i).score();
			if(frames.get(i).isStrike() == true)
			{
				if(i+1 <= frames.size())
				{
					TotalScore += frames.get(i+1).score();
				}
			}
		}
		return TotalScore;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return true;
	}
	
	public List<Frame> Getframes()
	{
		return frames;
	}
}
