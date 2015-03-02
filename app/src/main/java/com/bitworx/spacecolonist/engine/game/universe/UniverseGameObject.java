package com.bitworx.spacecolonist.engine.game.universe;

import com.bitworx.spacecolonist.engine.game.GameObject;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public class UniverseGameObject extends GameObject<GalaxisGameObject> {

    public List<GalaxisGameObject> getGalaxies()
    {
        return getChilds();
    }
}
