package com.bitworx.spacecolonist.engine.game.universe;

import com.bitworx.spacecolonist.engine.game.BaseGameObject;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public class SolarSystem extends BaseGameObject<PlanetGameObject> {

    private List<SunGameObject> _suns;
    public List<SunGameObject> getSuns()
    {
        return _suns;
    }

    public List<PlanetGameObject> getPlanets()
    {
        return getChilds();
    }

}
