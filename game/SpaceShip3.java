package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class SpaceShip3 extends SpaceShip {

    CollisionRect rect;

    public SpaceShip3() {
        skin = new Texture("ship-3.png");
        sprite = new Sprite(skin);
        setPosition(348, 50);
        this.rect = new CollisionRect(this.getX(), this.getY(), 24, 24);
    }

    public void update(float deltaTime) {
        rect.move(this.getX(), this.getY());
    }

    public void remove() {
    }

    public CollisionRect getCollisionRect() {
        return rect;
    }
}