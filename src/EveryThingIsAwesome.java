import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
public static void main(String[] args) {
	String thing = JOptionPane.showInputDialog("What is Awesome");
	JOptionPane.showMessageDialog(null, thing + " is awesome");
}
}
