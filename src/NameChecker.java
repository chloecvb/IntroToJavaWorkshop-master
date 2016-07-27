import javax.swing.JOptionPane;

public class NameChecker {
public static void main(String[] args) {
	JOptionPane.showInputDialog("Please enter your name.");
	String s1 = "chloe";
	String s2 = "name";
	if(s1.equals(s2)){
		JOptionPane.showMessageDialog(null, "Yay, you got the same name.");

}
}}
