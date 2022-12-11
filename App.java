package week5;

public class App {

public static void main (String[] arg) {
	
	
	Logger logger = new AsteriskLogger();
	
	logger.log("hello");
	logger.error("hello");
	
	Logger loggera= new SpacedLogger();
	
	loggera.log("Hello");
	loggera.error("Hello");
}
}
