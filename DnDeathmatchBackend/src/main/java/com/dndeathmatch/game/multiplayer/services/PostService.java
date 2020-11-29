package com.dndeathmatch.game.multiplayer.services;

import com.dndeathmatch.game.multiplayer.model.MapStateDTO;
import com.dndeathmatch.game.multiplayer.model.PostInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    MapStateDTO mapState;

    public List<PostInputDTO> findAll() {
        return mapState.getInputs();
    }

    public PostInputDTO save(PostInputDTO post) {
        return mapState.saveInput(post);
    }
}
