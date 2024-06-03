package com.arena.core.dto;

import java.util.List;

public class BattleDto {
    private String id;
    private String creationDate;
    private CharacterDto winner;
    private List<CharacterDto> duelists;
    private List<BattleRuleDto> battleRules;

    public BattleDto() {
    }

    public BattleDto(String id, String creationDate, CharacterDto winner, List<CharacterDto> duelists, List<BattleRuleDto> battleRules) {
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

    public CharacterDto getWinner() {
        return winner;
    }

    public void setWinner(CharacterDto winner) {
        this.winner = winner;
    }

    public List<CharacterDto> getDuelists() {
        return duelists;
    }

    public void setDuelists(List<CharacterDto> duelists) {
        this.duelists = duelists;
    }

    public List<BattleRuleDto> getBattleRules() {
        return battleRules;
    }

    public void setBattleRules(List<BattleRuleDto> battleRules) {
        this.battleRules = battleRules;
    }
}
