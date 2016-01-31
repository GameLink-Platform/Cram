package algorithms;
import org.gamelink.game.Cram;
import org.gamelink.game.Algo;

public class TEAMNAMEHERE extends Algo{ // Replace TeamName
    private static String teamName = "TEAMNAMEHERE"; // Replace TeamName

    public static String getTeamName(){
        return teamName;
    }

    public static void main(String[] args){
        Cram game = new Cram(false);
        game.startGame(TEAMNAMEHERE.class); // Replace TeamName
    }

    public static String algorithm(Cram game){
 
   /************************************************
    ************  PLACE ALGORITHM HERE  ************
    ************************************************/

    }
}
