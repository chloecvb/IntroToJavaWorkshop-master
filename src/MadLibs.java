import javax.swing.JOptionPane;

public class MadLibs {
public static void main (String[] arg) {
	String noun =
			JOptionPane.showInputDialog ("Please enter a noun");
	String verb = 
			JOptionPane.showInputDialog("Please enter a verb");
	String adjective =
			JOptionPane.showInputDialog("Please enter an adjective");
	String noun2 =
			JOptionPane.showInputDialog("Please enter a noun2");
	String verb2 =
			JOptionPane.showInputDialog("Please enter a verb2");
	System.out.println("There was a ____ who loved to play volleyball.");
	System.out.println("____ enjoyed to pass the volleyball from the back row.");
	System.out.println("_____ made great passes at tryouts.");
	System.out.println("The coach was very impressive at ______ that _____ made the JV team.");
	System.out.println("_____ was very proud of herself.");
}
}
