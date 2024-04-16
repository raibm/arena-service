package com.arena.core.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * Character is the most important thing in this app. Here we have all information about a player.
 * We use then to create battles, and give some badges.
 */
public class Character {
    private String id;
    private Integer totalWin;
    private Integer totalLost;
    private String nickname;
    private LocalDate creationDate;
    private String avatar;
    private String description;
    private Double winrate;
    private String title;
    private List<Battle> battles;
    private List<Badge> badges;

    public Character() {
    }

    public Character(String id, Integer totalWin, Integer totalLost, String nickname, LocalDate creationDate, String avatar, String description, Double winrate, String title
            , List<Battle> battles, List<Badge> badges) {
        this.id = id;
        this.totalWin = totalWin;
        this.totalLost = totalLost;
        this.nickname = nickname;
        this.creationDate = creationDate;
        this.avatar = avatar;
        this.description = description;
        this.winrate = winrate;
        this.title = title;
        this.battles = battles;
        this.badges = badges;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalWin() {
        return totalWin;
    }

    public void setTotalWin(Integer totalWin) {
        this.totalWin = totalWin;
    }

    public Integer getTotalLost() {
        return totalLost;
    }

    public void setTotalLost(Integer totalLost) {
        this.totalLost = totalLost;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWinrate() {
        return winrate;
    }

    public void setWinrate(Double winrate) {
        this.winrate = winrate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Battle> getBattles() {
        return battles;
    }

    public void setBattles(List<Battle> battles) {
        this.battles = battles;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }
}
