package chapter_6;

public class MyPoint {
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int inputX, int inputY){
		double distance =Math.sqrt((inputX-this.x)*(inputX-this.x)+(inputY-this.y)*(inputY-this.y));
		return distance;
	}
	
	
}
