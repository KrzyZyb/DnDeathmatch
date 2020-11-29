package com.dndeathmatch.game.multiplayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostInputDTO {
    private String title;
    private String content;
    private Long authorId;

    @Override
    public String toString() {
        return "PostInputDTO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}