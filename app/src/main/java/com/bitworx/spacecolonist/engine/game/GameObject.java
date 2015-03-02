package com.bitworx.spacecolonist.engine.game;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public abstract class GameObject<T> extends SimpleGameObject implements   IGameObjectNode<T> {



    private List<T> _childs=new LinkedList<>();

    protected List<T> getChilds() {
        return _childs;
    }

    public void addChild(T child) {
        _childs.add(child);
    }
}


