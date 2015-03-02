package com.bitworx.spacecolonist.engine.game;

import com.bitworx.spacecolonist.engine.game.universe.UniverseGameObject;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public class GameEngine implements IGameEngine {


    public GameEngine()
    {
        _root = new UniverseGameObject();
    }

    private IGameObject _root;
    public IGameObject getRoot() {
        return _root;
    }

    public ILoopResult endLoop() {
        return new LoopResult();
    }

    private ILoopResult simulateLoop() {
        return null;
    }
}
