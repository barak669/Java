package Enum;

public enum Level {
	
	HIGH (3 , 80),
	MEDIUM (2 , 60),
	LOW (1 , 40);
	
	private final int levelCode;
	private final int levelValue;
	
	Level (int leveCode, int levelValue)
	{
		this.levelCode = levelCode;
		this.levelValue = levelValue;
	}

	public int getLevelCode() {
		return levelCode;
	}

	public int getLevelValue() {
		return levelValue;
	}
	

}
