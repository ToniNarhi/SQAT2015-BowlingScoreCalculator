package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int result;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		result = firstThrow + secondThrow;
		if(firstThrow == 10)
		{
			isStrike();
		}
		else if(result == 10)
		{
			isSpare();
		}
		//to be implemented
		return result;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10)
		{
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(result == 10 && firstThrow != 10)
		{
			return true;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}
	
	public int GetFirstThrow()
	{
		return firstThrow;
	}
	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
