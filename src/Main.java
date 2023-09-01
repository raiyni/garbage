import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main
{
	public static void main (String[] args) {

		JPanel panel = new JPanel();
		panel.setSize(300, 300);
		JFrame frame = new JFrame ("MyPanel");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 300));
		frame.add(panel);
		frame.setVisible (true);
	}
}