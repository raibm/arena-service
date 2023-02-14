package com.arena.core.dto;

import java.util.List;

public class BattleDTO {
    private String id;
    private String creationDate;
    private CharacterDTO winner;
    private List<CharacterDTO> duelists;
    private List<BattleRuleDTO> battleRules;

    public BattleDTO() {
    }

    public BattleDTO(String id, String creationDate, CharacterDTO winner, List<CharacterDTO> duelists, List<BattleRuleDTO> battleRules) {
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

    public CharacterDTO getWinner() {
        return winner;
    }

    public void setWinner(CharacterDTO winner) {
        this.winner = winner;
    }

    public List<CharacterDTO> getDuelists() {
        return duelists;
    }

    public void setDuelists(List<CharacterDTO> duelists) {
        this.duelists = duelists;
    }

    public List<BattleRuleDTO> getBattleRules() {
        return battleRules;
    }

    public void setBattleRules(List<BattleRuleDTO> battleRules) {
        this.battleRules = battleRules;
    }
}
