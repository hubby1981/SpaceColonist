package com.bitworx.spacecolonist.engine.game;
import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 * This Class gives the Structure for all Game Engines
 */
public interface IGameEngine {

        IGameObject getRoot();
        ILoopResult endLoop();

}
