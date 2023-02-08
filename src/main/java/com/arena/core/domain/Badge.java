package com.arena.core.domain;

import java.time.LocalDate;

/**
 * Badge is a simple form to show to who is seeing your character, what achievements the current character got.
 */
public class Badge {
    private String name;
    private String description;
    private String icon;
    private LocalDate creationDate;

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

    @Override
    public String toString() {
        return "Badge{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
