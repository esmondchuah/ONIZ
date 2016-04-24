package com.oniz.Gestures;

import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.oniz.Game.GameRenderer;
import com.oniz.Game.GameWorld;

/**
 * Created by robin on 2/3/16.
 */
public class ZGestureListener implements GestureListener {
    private GameWorld gameWorld;
    private GameRenderer gr;

    public ZGestureListener(GameWorld gameWorld, GameRenderer gr) {
        this.gameWorld = gameWorld;
        this.gr = gr;
    }

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
//        System.out.println("touch down!");
        Vector3 tmpCoords = new Vector3(x, y, 0);
        this.gr.getCam().unproject(tmpCoords);
        System.out.println("tmpCords" + tmpCoords.x + ":" + tmpCoords.y);
        System.out.println("xy " + x + ":" + y);
        return false;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {
        System.out.println("tap!");

        return false;
    }

    @Override
    public boolean longPress(float x, float y) {
//        System.out.println("long press!");
        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
//        System.out.println("fling!");
        return false;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
//        System.out.println("pan!");
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
//        System.out.println("pan stop!");
        return false;
    }

    @Override
    public boolean zoom(float initialDistance, float distance) {
//        System.out.println("zoom!");
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        System.out.println("pinch!");
        return false;
    }
}
