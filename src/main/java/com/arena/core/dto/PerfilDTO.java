package com.arena.core.dto;

import java.util.List;

public class PerfilDTO {
    private String id;
    private String name;
    private String email;
    private List<CharacterDTO> characters;

    public PerfilDTO() {
    }

    public PerfilDTO(String id, String name, String email, List<CharacterDTO> characters) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.characters = characters;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CharacterDTO> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharacterDTO> characters) {
        this.characters = characters;
    }
}
