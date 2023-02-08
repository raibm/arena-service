package com.arena.core.domain;

/**
 * BattleTheme is a class accountable for represent all battle themes.Think about Battle Themes
 * like a school of abilities, like fire, gravity, electric, etc.
 * <p>
 * BattleTheme represent a main concept power about a character.
 */
public class BattleTheme {
    private String id;
    private String name;
    private String description;

    public BattleTheme() {
    }


    public BattleTheme(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
