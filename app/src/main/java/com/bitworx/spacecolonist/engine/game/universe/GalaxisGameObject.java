package com.bitworx.spacecolonist.engine.game.universe;

import com.bitworx.spacecolonist.engine.game.BaseGameObject;

import java.util.List;

import javax.xml.transform.SourceLocator;

/**
 * Created by Marcel on 01.03.2015.
 */
public class GalaxisGameObject extends BaseGameObject<SolarSystem> {

    public List<SolarSystem> getSolarSystems()
    {
        return getChilds();
    }

}
