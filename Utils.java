public class Utils 
{

	/**
	 *  Display the splash screen
	 */
	public static void splashScreen() {
		System.out.println(printSeparator("-",80));
	    System.out.println("Welcome to ChicagoSQLite"); // Display the string.
		System.out.println("ChicagoSQLite Version " + Settings.getVersion());
		System.out.println(Settings.getCopyright());
		System.out.println("\nType \"help;\" to display supported commands.");
		System.out.println(printSeparator("-",80));
	}

	public static String printSeparator(String s, int len) {
		String bar = "";
		for(int i = 0; i < len; i++) {
			bar += s;
		}
		return bar;
	}

}
