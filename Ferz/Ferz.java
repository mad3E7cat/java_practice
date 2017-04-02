// indxes - strings, values - columns
public class Ferz
{
    static int[] chessboard = {0,0,0,0,0,0,0,0};
    static int index = 0;
    static int version = 0;

    public static void main(String[] args)
    {
        do {
            if (checking()){
                if (index == 7) {
                    //System.out.println(version++ + " [0]=" + chessboard[0] + " [1]=" + chessboard[1] + " [2]=" + chessboard[2] + " [3]=" + chessboard[3] + " [4]=" + chessboard[4] + " [5]=" + chessboard[5] + " [6]=" + chessboard[6] + " [7]=" + chessboard[7]);
                    version++;
                    System.out.println(version + ")");
                    //version++; // if no System.out
                    chessboardOutput(chessboard);
                    chessboard[index]++;
                }
                else {
                    index++;
                }
            }
            else 
            {
                chessboard[index]++;
            }
        }while (chessboard[0] < 8);
        System.out.println(version + " solutions.");
    }
    static void chessboardOutput(int[] board)
    {
        String[][] outBoard = new String[8][8];
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                outBoard[i][j] = " # ";
            }
        }   
        for(int i = 0; i < 8; i++)
        {
            if(board[i] != 0)
            {
                outBoard[i][board[i]] = " Q ";
            }
        }
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                System.out.print(outBoard[i][j]);
            }
            System.out.println("");
        }
    }
    //
    static boolean checking() 
    {
        int i;

        if (index == 0) 
        {
            return true;
        }

        if (chessboard[index] > 7)
        {
            chessboard[index] = 0;
            index--;
            return false;
        }

        for (i=0; i < index; i++)
        {
            if ((chessboard[index] == chessboard[i])|((Math.abs(chessboard[index] - chessboard[i])) == (index-i)))
            {
                return false;
            }
        }
        return true;
   }
}