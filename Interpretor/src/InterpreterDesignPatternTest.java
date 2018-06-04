import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterpreterDesignPatternTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String question= JOptionPane.showInputDialog(frame, "What is your question?");
		
		ConversionContext context = new ConversionContext(question);
		JOptionPane.showConfirmDialog(frame, context.getConvertedOutput());
	}
}
