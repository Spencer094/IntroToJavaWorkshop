import javax.swing.JOptionPane;

public class MadLibs {
public static void main(String[] args) {
	String noun1 = JOptionPane.showInputDialog("noun?");
 String city1 = JOptionPane.showInputDialog("city?");
 String noun2 = JOptionPane.showInputDialog("same noun?");
		 String verbing1 = JOptionPane.showInputDialog("verb ending in ing?");
		 String partofcity1 = JOptionPane.showInputDialog("part of city that you chose?");
		 String partofcity2 = JOptionPane.showInputDialog("sme part of city?");
		 JOptionPane.showMessageDialog(null, "There are alot of " + noun1 + " in " + city1 + " the " + noun2 + " were " + verbing1 + " at " + partofcity1 + " but then they got board and left " + partofcity2);
}
}
