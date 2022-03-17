package com.example.exercise1.dto;

import com.example.exercise1.model.Category;

public class BlogDto {
    private Long id;
    private String tile;
    private String body;
    private String summary;

    private Category category;

    public BlogDto() {
    }

    public BlogDto(Long id, String tile, String body, String summary, Category category) {
        this.id = id;
        this.tile = tile;
        this.body = body;
        this.summary = summary;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
