package com.company;

public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass (int playerCount)
    {
        board = new int[playerCount];
        for (int i = 0; i < playerCount; i++)
        {
            board[i] = (int)(Math.random()*10+1);
        }
        currentPlayer = (int)(Math.random()*playerCount);
    }
    public void distributeCurrentPlayerTokens()
    {
        int tcount = board[currentPlayer], x = currentPlayer + 1;
        board[currentPlayer] = 0;
        for(int i = tcount; i > 0; i --)
        {
            if(x >= board.length)
            {
                x = 0;
            }
            board[x]++;
            x++;
        }
    }
    public String getBoard()
    {
        String bored = "";
        for(int i = 0; i < board.length; i++)
        {
            bored += "[" + board[i] + "]";
        }
        return bored;
    }
    public int getCurrentPlayer()
    {
        return currentPlayer;
    }
}
