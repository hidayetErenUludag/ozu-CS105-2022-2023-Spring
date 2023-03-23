package week5.exercise.solutions;

public class TestCombinedTable {

	public static void main(String[] args) {
		//t1 has 4 seats, a view quality of 60.0, and a height of 74 centimeters
		SingleTable table1=new SingleTable(4, 60, 74);
		SingleTable table2=new SingleTable(8, 70, 74);
		SingleTable table3=new SingleTable(12, 75, 76);
		
		CombinedTable combinedTable1=new CombinedTable(table1, table2);
		System.out.println(combinedTable1.canSeat(9));
		System.out.println(combinedTable1.canSeat(11));
		System.out.println(combinedTable1.getDesirability());
		
		CombinedTable combinedTable2=new CombinedTable(table2, table3);
		System.out.println(combinedTable2.canSeat(18));
		System.out.println(combinedTable2.getDesirability());
		table2.setViewQuality(80);
		System.out.println(combinedTable2.getDesirability());	
		
		CombinedTable combinedTable3=new CombinedTable(table1, table3);
		System.out.println(combinedTable3.canSeat(12));
		System.out.println(combinedTable3.canSeat(18));
		System.out.println(combinedTable3.getDesirability());

	}

}
