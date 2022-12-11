package week5;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("H" + " " + "e" + " " + "l" + " " + "l" + " " + "o");
		
	}

	@Override
	public void error(String error) {
	    System.out.println("ERROR" + ":" + "H" + " " + "e" + " " + "l" + " " + "l" + " " +  "O");
		
	}

}
