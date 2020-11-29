package com.dndeathmatch.game.multiplayer.websocket;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.websocket")
public class WebsocketProperties {
    /**
     * Prefix used for WebSocket destination mappings
     */
    final static String APPLICATION_PREFIX = "/topic";
    /**
     * Prefix used by topics
     */
    final static String TOPIC_PREFIX = "/topic";
    /**
     * Endpoint that can be used to connect to
     */
    final static String ENDPOINT = "/live";
    /**
     * Allowed origins
     */
    final static String[] ALLOWED_ORIGINS = new String['*'];
}
