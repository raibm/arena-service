package com.arena.core.domain;

import java.util.List;

public class Perfil {
    private String id;
    private String name;
    private String email;
    private List<Character> characters;

    public Perfil() {
    }

    public Perfil(String id, String name, String email, List<Character> characters) {
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

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
