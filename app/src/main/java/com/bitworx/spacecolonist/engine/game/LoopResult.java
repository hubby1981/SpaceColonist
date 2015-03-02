package com.bitworx.spacecolonist.engine.game;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public class LoopResult implements ILoopResult {

    private List<IGameObject> _preEvents;
    public List<IGameObject> getPreEvents() {
        return _preEvents;
    }

    public void setPreEvents(List<IGameObject> preEvents) {
    _preEvents=preEvents;
    }

    private List<IGameObject> _doEvents;
    public List<IGameObject> getDoEvents() {
        return _doEvents;
    }

    public void setDoEvents(List<IGameObject> doEvents) {
        _doEvents=doEvents;
    }

    private List<IGameObject> _afterEvents;
    public List<IGameObject> getAfterEvents() {
        return _afterEvents;
    }

    public void setAfterEvents(List<IGameObject> afterEvents) {
        _afterEvents=afterEvents;
    }

    private List<IGameObject> _initEvents;
    public List<IGameObject> getInitEvents() {
        return _initEvents;
    }

    public void setInitEvents(List<IGameObject> initEvents) {
         _initEvents=initEvents;
    }
}
