package com.bitworx.spacecolonist.engine.bank;

import com.bitworx.spacecolonist.engine.point.PointBoard;

/**
 * Created by Marcel on 01.03.2015.
 */
public class BaseCreditsStore {
    private GameCredits _gameCredits;

    private PointBoard _pointBoard;

    public GameCredits getGameCredits()
    {
        return _gameCredits;
    }

    public PointBoard getPointBoard()
    {
        return _pointBoard;
    }
}
