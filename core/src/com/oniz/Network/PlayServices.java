package com.oniz.Network;

import com.oniz.Game.ZGame;

/**
 * Created by yanyee on 3/18/2016.
 */
public interface PlayServices {

    public void signIn();

    public void signOut();

    public void startQuickGame();

    public void leaveGame();

    public void broadcastMessage(String message);

    public void setGame(ZGame zgame);

    public void rateGame();

    public void unlockAchievement();

    public void submitScore(int highScore);

    public void showAchievement();

    public void showScore();

    public boolean isSignedIn();

    public boolean canLeaveRoom();
}
