package com.theironyard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by zach on 6/28/16.
 */
@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    User sender;

    @ManyToOne
    User recipient;

    @Column(nullable = false)
    String filename;

    LocalDateTime ldt;

    int viewSeconds;

    boolean isPublic;

    public Photo() {
    }

    public Photo(User sender, User recipient, String filename, int viewSeconds, boolean isPublic) {
        this.sender = sender;
        this.recipient = recipient;
        this.filename = filename;
        this.viewSeconds = viewSeconds;
        this.isPublic = isPublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public long getViewSeconds() {
        return viewSeconds;
    }

    public void setViewSeconds(int viewSeconds) {
        this.viewSeconds = viewSeconds;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
}
