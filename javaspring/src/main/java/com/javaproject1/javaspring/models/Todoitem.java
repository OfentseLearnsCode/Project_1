package com.javaproject1.javaspring.models;

import java.time.Instant;


public class Todoitem {
    private Long id;
    private String title;
    private boolean isComplete;
    Instant createdAt;

    private Todoitem(Long id, String title, boolean isComplete, Instant createdAt){
        this.id=id;
        this.title=title;
        this.isComplete=isComplete;
        this.createdAt=createdAt;
}
public Long getId() {
    return this.id;
}
public void setId(Long id) {
    this.id =id;
}
public String getTitle(String title){
    this.title =title;
}
public boolean getIsComplete() {
    this.isComplete=isComplete;
    
}
}
