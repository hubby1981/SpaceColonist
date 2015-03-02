package com.bitworx.spacecolonist.engine.bank;

/**
 * Created by Marcel on 01.03.2015.
 */
public class GameCredits {
    private double _credits;
    public double getCredits()
    {
        return _credits;
    }

    private void setCredits(double credits)
    {
        _credits=credits;
    }

    public double addBy(double addBy)
    {
        setCredits(getCredits()+addBy);
        return _credits;
    }

    public double reduceBy(double reduceBy)
    {
        setCredits(getCredits()-reduceBy);
        return getCredits();
    }
}
