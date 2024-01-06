package com.memento;

public class Editor {
    private String content;
    private String undoContent;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.undoContent = this.content;
        this.content = content;
    }

    public void undo(){
        this.content = undoContent;
    }
}
