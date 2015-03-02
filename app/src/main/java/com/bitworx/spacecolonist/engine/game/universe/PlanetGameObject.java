package com.bitworx.spacecolonist.engine.game.universe;

import com.bitworx.spacecolonist.engine.game.BaseGameObject;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public class PlanetGameObject extends BaseGameObject<MoonGameObject> {

    public List<MoonGameObject> getMoons()
    {
        return getChilds();
    }
}
