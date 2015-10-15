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
					if(frames.get(i+1).isStrike() == true)
					{
						TotalScore += frames.get(i+1).score();
						TotalScore += frames.get(i+2).GetFirstThrow();
						int temp = 0;
						for(int x = i+2; x < frames.size() && frames.get(x).isStrike() == true; x++)
						{
							TotalScore += frames.get(x+1).GetFirstThrow();
							temp = x;
						}
						System.out.println(temp);
						if(temp > 0 && frames.get(temp).isStrike() != true && frames.get(temp-1).isStrike() == true)
						{
							TotalScore += frames.get(temp).GetFirstThrow();
						}
					}
					else
					{
						TotalScore += frames.get(i+1).score();
					}

				}
			}
			if(frames.get(i).isStrike() == true && i == frames.size())
			{
				Frame framebonus = new Frame (7,2);
				addFrame(framebonus);
				TotalScore += frames.get(i+1).score();
				i = frames.size();
			}
			else if(frames.get(i).isSpare() == true)
			{
				if(i+1 < frames.size())
				{
					TotalScore += frames.get(i+1).GetFirstThrow();
				}
				else
				{
					Frame framebonus = new Frame (7,0);
					addFrame(framebonus);
					TotalScore += frames.get(i+1).GetFirstThrow();
					i = frames.size();
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
