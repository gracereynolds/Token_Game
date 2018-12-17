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
        int tcount, x = currentPlayer + 1;
        board[currentPlayer] = 0;
        for(tcount = board[currentPlayer]; tcount > 0; tcount --)
        {
            if(x >= board.length)
            {
                x = 0;
            }
            board[x]++;
            x++;
        }
    }
}
