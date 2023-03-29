package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

import model.RowGameModel;
import controller.RowGameController;

public class RowGameGUI implements RowGameView{
    public JFrame gui = new JFrame("Tic Tac Toe");
    public RowGameModel gameModel = new RowGameModel();
    // public JButton[][] blocks = new JButton[3][3];
    public JButton reset = new JButton("Reset");
    public JTextArea playerturn = new JTextArea();
    private RowGameController gameController;
    public RowGameBoardView gameBoardView;
    public RowGameStatusView gameStatusView;

    /**
     * Creates a new game initializing the GUI.
     */
    public RowGameGUI(RowGameController gameController) {
        this.gameController = gameController;
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(500, 350));
        gui.setResizable(true);
        
        //this class RowGameBoardView 
        gameBoardView = new RowGameBoardView(this.gameController);
        JPanel gamePanel = gameBoardView.gamePanel;
        // JPanel gamePanel = new JPanel(new FlowLayout());
        // JPanel game = new JPanel(new GridLayout(3,3));
        // gamePanel.add(game, BorderLayout.CENTER);

        JPanel options = new JPanel(new FlowLayout());
        options.add(reset);
        //this RowGameStatusView
        gameStatusView = new RowGameStatusView(this.gameController);
        JPanel messages = gameStatusView.messages;
        // JPanel messages = new JPanel(new FlowLayout());
        // messages.setBackground(Color.white);

        gui.add(gamePanel, BorderLayout.NORTH);
        gui.add(options, BorderLayout.CENTER);
        gui.add(messages, BorderLayout.SOUTH);

        gameStatusView.messages.add(playerturn);
        
        // messages.add(playerturn);
        // playerturn.setText("Player 1 to play 'X'");

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameController.resetGame();
            }
        });

        
    }

    /**
     * Updates the block at the given row and column 
     * after one of the player's moves.
     *
     * @param gameModel The RowGameModel containing the block
     * @param row The row that contains the block
     * @param column The column that contains the block
     */

    // this gui uses interface and update the RowGameBoardView and RowGameStatusView
    public void update(RowGameModel gameModel) {
        gameBoardView.update(gameModel);
    
        gameStatusView.update(gameModel);
        }
}
