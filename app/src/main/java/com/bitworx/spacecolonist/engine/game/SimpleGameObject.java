package com.bitworx.spacecolonist.engine.game;

public abstract class SimpleGameObject implements IGameObject
{

    private EnumGameObjectTypes _gameObjectType;
    public EnumGameObjectTypes getGameObjectType() {
        return _gameObjectType;
    }
}
