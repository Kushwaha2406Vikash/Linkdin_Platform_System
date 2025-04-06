package com.linkdin_platform;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Post {

    private UUID postid;
    private User user;
    private String content;
    private String medialink;
    private LocalDateTime  createdDateTime;

    public Post(User user,String content,String medialink) {
        this.user = user;
        this.content= content;
        this.medialink=medialink;
        this.postid=UUID.randomUUID();
        this.createdDateTime=LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public String getMedialink() {
        return medialink;
    }
}
