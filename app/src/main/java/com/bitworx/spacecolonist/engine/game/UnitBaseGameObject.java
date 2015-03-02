package com.bitworx.spacecolonist.engine.game;

import com.bitworx.spacecolonist.engine.game.living.UnitGameObject;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public class UnitBaseGameObject extends BaseGameObject<UnitGameObject> {

    public List<UnitGameObject> getUnits()
    {
        return getChilds();
    }
}