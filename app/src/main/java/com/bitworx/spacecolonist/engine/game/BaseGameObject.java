package com.bitworx.spacecolonist.engine.game;

/**
 * Created by Marcel on 01.03.2015.
 */
public class BaseGameObject<T> extends GameObject<T> {

    private String _name;
    public String getName()
    {
        return _name;
    }

    private int _stage=0;
    public int getStage()
    {
        return _stage;
    }

    public void setStage(int stage)
    {
        if(_stage<9)
            _stage=stage;
    }
}
