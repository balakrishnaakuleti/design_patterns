import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MementoTest extends JFrame {

	private CareTaker careTaker;
	private Originator originator;
	private JButton save, undo, redo;
	private JTextArea articleArea;
	private JPanel panel;
	int saveFilesTotal = 0, currentArticleIndex = 0;

	public static void main(String[] args) {
		new MementoTest();
	}

	public MementoTest() {
		// Basic setup of panel, text area, buttons.
		this.setSize(750, 780);
		this.setTitle("Memento Design Pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		careTaker = new CareTaker();
		originator = new Originator();
		save = new JButton("Save");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		articleArea = new JTextArea(40, 70);
		panel = new JPanel();
		panel.add(new JLabel("Article"));
		panel.add(articleArea);
		panel.add(save);
		panel.add(undo);
		panel.add(redo);
		this.add(panel);
		this.setVisible(true);

		// Event mechanism for buttons
		ButtonListener saveListener = new ButtonListener();
		ButtonListener undoListener = new ButtonListener();
		ButtonListener redoListener = new ButtonListener();
		save.addActionListener(saveListener);
		undo.addActionListener(undoListener);
		redo.addActionListener(redoListener);

	}

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == save) {
				careTaker.addMemento(originator.getMementoFromArticle(articleArea.getText()));
				saveFilesTotal++;
				currentArticleIndex++;
				System.out.println(saveFilesTotal);
				undo.setEnabled(true);

			} else if (e.getSource() == undo) {
				if (currentArticleIndex >= 1) {
					currentArticleIndex--;
					articleArea.setText(originator.getArticleFromMemento(careTaker.getMemento(currentArticleIndex)));
					redo.setEnabled(true);
				} else {
					undo.setEnabled(false);
				}

			} else if (e.getSource() == redo) {
				if ((saveFilesTotal - 1) >currentArticleIndex) {
					currentArticleIndex++;
					articleArea.setText(originator.getArticleFromMemento(careTaker.getMemento(currentArticleIndex)));
					undo.setEnabled(true);
				} else {
					redo.setEnabled(false);
				}

			}
		}

	}

}
