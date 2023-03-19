// package model;


// public class RowGameModel 
// {
//     public static final String GAME_END_NOWINNER = "Game ends in a draw";

//     public RowBlockModel[][] blocksData = new RowBlockModel[3][3];

//     /**
//      * The current player taking their turn
//      */
//     public String player = "1";
//     public int movesLeft = 9;

//     private String finalResult = null;


//     public RowGameModel() {
// 	super();

// 	for (int row = 0; row < 3; row++) {
// 	    for (int col = 0; col < 3; col++) {
// 		blocksData[row][col] = new RowBlockModel(this);
// 	    } // end for col
// 	} // end for row
//     }

//     public String getFinalResult() {
// 	return this.finalResult;
//     }

//     public void setFinalResult(String finalResult) {
// 	this.finalResult = finalResult;
//     }
// }

package model;

public class RowGameModel {

    public static final String GAME_END_NOWINNER = "Game ends in a draw";

    public RowBlockModel[][] blocksData = new RowBlockModel[3][3];

    private Player player = Player.PLAYER_1;
    public int movesLeft = 9;
    public String finalResult = null;

    public RowGameModel() {
        super();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                blocksData[row][col] = new RowBlockModel(this);
            }
        }
    }

    public String getFinalResult() {
        return this.finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }
    // public void setPlayer(String string) {
        
    // }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        if (player!=Player.PLAYER_1 && player!=Player.PLAYER_2){
            throw new IllegalArgumentException("Invalid");
        }
        this.player = player;
    }

    public int getMovesLeft() {
        return movesLeft;
    }

    public void setMovesLeft(int movesLeft) {
        this.movesLeft = movesLeft;
    }

    public RowBlockModel[][] getBlocksData() {
        return blocksData;
    }

    public void setBlocksData(RowBlockModel[][] blocksData) {
        this.blocksData = blocksData;
    }

    public enum Player {
        PLAYER_1, PLAYER_2
    }

    

    

}

