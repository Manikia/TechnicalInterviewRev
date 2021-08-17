import java.util.ArrayList;
import java.util.List;

public class real{
    public static void main(String[] args){
      List<String> cmds = new ArrayList<String>();
      cmds.add("RIGHT");
      cmds.add("DOWN");
      cmds.add("LEFT");
      cmds.add("LEFT");
      cmds.add("DOWN");

      int testResult = roverMove(4, cmds);
      
      System.out.println(testResult);
    }


  public static int roverMove(int matrixSize, List<String> cmds) {

    int row = 0, column = 0;
    for(int i = 0; i < cmds.size(); i++)
    {
        //running through the given list ^
        //we are checking where its going to move based on list type v
        switch(cmds.get(i))
        {
            case "UP":
            {
                //moving up on the Y axis
                row++;
                if (row == 1)
                    row--;
              break;
            }
            case "DOWN":
            {
                //moving down on y axis
                row--;
                if (Math.abs(row) == matrixSize)
                    row++;

              break;
            }
            case "LEFT":
            {
                //moving left on x axis
                column--;
                if (Math.abs(column) == -1)
                    column++;
              break;
            }
            case "RIGHT":
            {
                //moving right on x axis
                column++;

                if(column == matrixSize)
                  column--;
              break;
            }
            default:
            {
                System.out.println("Invalid Input");
            }
        }
    }
    System.out.println("row: " + row + "col: " + column);
    return (Math.abs(row) * matrixSize) + Math.abs(column);

    }
  
}

// (row * size) + column