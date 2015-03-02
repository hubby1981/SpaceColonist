package com.bitworx.spacecolonist.engine.game;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public interface ILoopResult {
    List<IGameObject> getPreEvents();
    void setPreEvents(List<IGameObject> preEvents);

    List<IGameObject> getDoEvents();
    void setDoEvents(List<IGameObject> doEvents);

    List<IGameObject> getAfterEvents();
    void setAfterEvents(List<IGameObject> afterEvents);

    List<IGameObject> getInitEvents();
    void setInitEvents(List<IGameObject> initEvents);
}
