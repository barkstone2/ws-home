package p04001;

public class GlobalFood {
	public GlobalFood() {
		System.out.println("GlobalFood() Constructor");
	}
	public void makeFood(IFood food){
		System.out.println("makeFood() Start");
		food.makeFood();
	}
}
