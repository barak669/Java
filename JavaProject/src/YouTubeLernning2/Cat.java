package YouTubeLernning2;

public class Cat extends Mammal{
	
	private int mustacLengh;
	private int jumpHeigth;
	
	public Cat(int weight, int height, String color, int mp, int mn, int ml, int jh) {
		super(weight, height, color, mp, mn);
		this.mustacLengh = ml;
		this.jumpHeigth = jh;
	}

	public int getMustacLengh() {
		return mustacLengh;
	}

	public void setMustacLengh(int mustacLengh) {
		this.mustacLengh = mustacLengh;
	}

	public int getJumpHeigth() {
		return jumpHeigth;
	}

	public void setJumpHeigth(int jumpHeigth) {
		this.jumpHeigth = jumpHeigth;
	}
	
}
