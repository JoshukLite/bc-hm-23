package org.simple.dto;

import org.simple.meta.Column;
import org.simple.meta.Entity;
import org.simple.meta.Id;
import org.simple.meta.Table;

@Entity
@Table(name = "notes")
public class Note {

    @Id
    @Column(name = "note_id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
