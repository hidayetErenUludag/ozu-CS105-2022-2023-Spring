package week5.exercise.solutions;
/**
 * A CombinedTable can seat a number of customers that is 
 * two fewer than the total number of seats in its two 
 * SingleTable objects to account for seats lost 
 * when the tables are pushed together.
 * A CombinedTable has a desirability that depends on 
 * the views and heights of the two single tables. 
 * If the two single tables of a CombinedTable object are 
 * the same height, the desirability of the CombinedTable 
 * object is the average of the view qualities of the two 
 * single tables.
 * If the two single tables of a CombinedTable object are 
 * not the same height, the desirability of the 
 * CombinedTable object is 10 units less than the 
 * average of the view qualities of the two single tables.

 */
public class CombinedTable {
	private SingleTable t1;
	private SingleTable t2;

	
	public CombinedTable(SingleTable t1, SingleTable t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	public boolean canSeat(int count){
		if(count<=t1.getSeat()+t2.getSeat()-2)
			return true;
		return false;
	}
	
	public double getDesirability() {
		double avg=(t1.getViewQuality()+t2.getViewQuality())/2;
		if(t1.getHeight()==t2.getHeight())
			return avg;
		else
			return avg-10;
			
		
	}
	
}
