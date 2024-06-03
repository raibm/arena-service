package com.arena.core.dto;

import java.time.LocalDate;

public class BadgeDto {
    private String id;
    private String name;
    private String description;
    private String icon;
    private LocalDate creationDate;

    public BadgeDto() {
    }

    public BadgeDto(String id, String name, String description, String icon, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.creationDate = creationDate;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

}
