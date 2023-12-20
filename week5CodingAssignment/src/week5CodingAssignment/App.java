package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test methods on AsteriskLogger
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Test methods on SpacedLogger
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");

	}

}
