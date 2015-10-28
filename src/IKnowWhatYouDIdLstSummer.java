import javax.swing.JOptionPane;

public class IKnowWhatYouDIdLstSummer {
public static void main(String[] args) {
	String thing = JOptionPane.showInputDialog("What did you do last summer?");
			JOptionPane.showMessageDialog(null, "I'm your stalker I alredy know that you " + thing + " last summer");
}
}
