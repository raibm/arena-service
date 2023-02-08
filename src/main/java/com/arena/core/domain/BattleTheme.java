package com.arena.core.domain;

/**
 * BattleTheme is a class accountable for represent all battle themes.Think about Battle Themes
 * like a school of abilities, like fire, gravity, electric, etc.

 * BattleTheme represent a main concept power about a character.
 */
public class BattleTheme {
    private String name;
    private String description;

    public BattleTheme() {
    }
    public BattleTheme(String name, String description) {
        this.name = name;
        this.description = description;
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

    @Override
    public String toString() {
        return "BattleTheme{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
