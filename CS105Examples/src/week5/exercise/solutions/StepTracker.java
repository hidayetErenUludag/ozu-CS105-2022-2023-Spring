package week5.exercise.solutions;

public class StepTracker {
    private int targetStepCount;
    private int totalSteps;
    private int dayCount=0;
    private int activeDayCount=0;
    
	public StepTracker(int stepCount) {
		this.targetStepCount=stepCount;
	}
	
	public void addDailySteps(int dailyStepCount) {
		totalSteps+=dailyStepCount;
		dayCount++;
		if(dailyStepCount>=targetStepCount) {
			activeDayCount++;
		}
	}
	
	public int activeDays(){
		return activeDayCount;
	}
	
	public int averageSteps() {
		if(dayCount==0)
			return 0;
		return totalSteps/dayCount;
	}

	public int getTotalSteps() {
		return totalSteps;
	}


}
