package com.arena.core.domain;

import java.util.List;

public class Battle {
    private String id;
    private String creationDate;
    private Character winner;
    private List<Character> duelists;
    private List<BattleRule> battleRules;

    public Battle() {
    }

    public Battle(String id, String creationDate, Character winner, List<Character> duelists, List<BattleRule> battleRules) {
        this.id = id;
        this.creationDate = creationDate;
        this.winner = winner;
        this.duelists = duelists;
        this.battleRules = battleRules;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Character getWinner() {
        return winner;
    }

    public void setWinner(Character winner) {
        this.winner = winner;
    }

    public List<Character> getDuelists() {
        return duelists;
    }

    public void setDuelists(List<Character> duelists) {
        this.duelists = duelists;
    }

    public List<BattleRule> getBattleRules() {
        return battleRules;
    }

    public void setBattleRules(List<BattleRule> battleRules) {
        this.battleRules = battleRules;
    }
}
