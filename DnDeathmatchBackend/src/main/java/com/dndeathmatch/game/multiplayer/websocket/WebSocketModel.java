package com.dndeathmatch.game.multiplayer.websocket;

public class WebSocketModel {

    private String name;

    public WebSocketModel() {}

    public WebSocketModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}