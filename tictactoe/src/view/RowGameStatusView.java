package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.RowGameController;
import model.RowGameModel;
import model.RowGameModel.Player;


public class RowGameStatusView implements RowGameView
{
    public JTextArea playerturn = new JTextArea();
    public JPanel messages = new JPanel(new FlowLayout());

    
    public RowGameStatusView(RowGameController gameController) {
	super();

	// messages.setBackground(Color.white);
	// messages.add(playerturn);
	// playerturn.setEditable(false);
    }

    public void update(RowGameModel gameModel) {
        messages.setBackground(Color.white);
		messages.add(playerturn);
		
		
		}
}