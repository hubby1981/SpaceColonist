package com.bitworx.spacecolonist.engine.point;

/**
 * Created by Marcel on 01.03.2015.
 */
public abstract class GamePoint {
    private int _points=0;
    public int getPoints()
    {
        return _points;
    }

    private void setPoints(int points)
    {
        _points = points;
    }

    public int reduceBy(int reduceBy)
    {
        setPoints(getPoints()-reduceBy);
        if(getPoints()<0)setPoints(0);
        return getPoints();
    }

    public int addBy(int addBy)
    {
        setPoints(getPoints()+addBy);
        return getPoints();
    }

    public GamePoint()
    {

    }

    public GamePoint(int points)
    {
        setPoints(points);
    }
}
