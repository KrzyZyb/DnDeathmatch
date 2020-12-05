package com.dndeathmatch.game.multiplayer.websocket;

import com.dndeathmatch.game.multiplayer.model.PostInputDTO;
import com.dndeathmatch.game.multiplayer.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    PostService postService;

    @MessageMapping("/posts/create")
    @SendTo("/topic/posts/created")
    public PostInputDTO save(PostInputDTO post) {
        return postService.save(post);
    }
}