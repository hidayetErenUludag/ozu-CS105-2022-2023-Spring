package homework2;
/**
 * 
 * @author Esma Meral
 *
 */
public class TemperatureTest {

	public static void main(String[] args) {
		double[][] temps = { { 95.5, 100.0, 100.0, 100.0, 100.0, 110.3 }, { 0, 50, 50, 50, 50, 0 },
				{ 0, 40, 40, 40, 40, 0 }, { 0, 20, 20, 20, 20, 0 }, { 0, 0, 0, 0, 0, 0 } };
		TemperatureGrid grid = new TemperatureGrid(temps);
		System.out.println(grid.updateAllTemps(0.01));
		System.out.println(grid);
	}

}
