/* 
Brandon Miller
ITSE 1302
4/11/17
*/


import java.util.Random;

public class RollDice
{
	private int spots; 
	private static Random generator;
	
	
	
	public RollDice()
	{
		generator = new Random();
		
		spots = 0;
	}
	
		public void roll()
	{
		
		spots = generator.nextInt(6) + 1;
	}
	
	
	public int getSpots()
	{
		return spots;
	}
}


for (count=0; count < NUMBER; count++) {

		die1.roll();
		die1Value = die1.getSpots();
		die2.roll();
		die2Value = die2.getSpots();
		
		if (die1Value == die2Value) {
		}
			if (die1Value==1){
				if (die2Value==1)
				snakeEyes++; }
			else
				if (die1Value==2){
					if (die2Value==2)
					twos++; }
				else
					if (die1Value==3) {
						if (die2Value==3)
						threes++; }
					else
						if (die1Value==4) {
							if (die2Value==4)
							fours++; }
						else
							if (die1Value==5) {
								if (die2Value==5)
								fives++; }
							else
								if (die1Value==6) {
									if (die2Value==6)
									sixes++; }
								}
