package week5.exercise.solutions;

public class SingleTable {
	private int seat;
	private double viewQuality;
	private int height ;
	
	public SingleTable(int seat, double viewQuality, int height) {
		super();
		this.seat = seat;
		this.viewQuality = viewQuality;
		this.height = height;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public double getViewQuality() {
		return viewQuality;
	}

	public void setViewQuality(double viewQuality) {
		this.viewQuality = viewQuality;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
 

}
