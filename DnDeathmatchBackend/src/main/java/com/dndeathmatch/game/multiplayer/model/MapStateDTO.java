package com.dndeathmatch.game.multiplayer.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MapStateDTO {
    private static int counter = 0;
    private List<PostInputDTO> inputs = new ArrayList<>();

    public List<PostInputDTO> getInputs() {
        return inputs;
    }

    public PostInputDTO saveInput(PostInputDTO input){
        this.inputs.add(input);
        System.out.println("Added input: "+input.toString());
        System.out.println("Current inputs: ");
        inputs.forEach(e -> System.out.println(e.toString()));
        return input;
    }

    private void incrementUser(){
        counter++;
    }

    @Override
    public String toString() {
        return "MapStateDTO{numberOfUsers= "+counter+" }";
    }
}
