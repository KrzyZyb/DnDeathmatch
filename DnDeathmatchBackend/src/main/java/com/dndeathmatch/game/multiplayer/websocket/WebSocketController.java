package com.dndeathmatch.game.multiplayer.websocket;

import com.dndeathmatch.game.multiplayer.Message;
import com.dndeathmatch.game.multiplayer.OutputMessage;
import com.dndeathmatch.game.multiplayer.model.PostInputDTO;
import com.dndeathmatch.game.multiplayer.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class WebSocketController {

    @Autowired
    PostService postService;

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }

    @SubscribeMapping("/posts/get")
    public List<PostInputDTO> findAll() {
        System.out.println("Posts/get/reached!!!");
        return postService.findAll();
    }

    @MessageMapping("/posts/create")
    @SendTo("/topic/posts/created")
    public PostInputDTO save(PostInputDTO post) {
        System.out.println("topic/posts/created/reached!!!");
        return postService.save(post);
    }
}