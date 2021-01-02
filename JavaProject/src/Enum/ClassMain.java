package Enum;

public class ClassMain {

	public static void main(String[] args) {
		
		Level level = Level.MEDIUM;
		
		System.out.println(level.getLevelCode());
		System.out.println(level.getLevelValue());
		System.out.println(Level.values()[1]);
		System.out.println(level.valueOf("MEDIUM"));


	}

}
