package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Message {

    private final UUID id;
    private final UUID channelId;
    private final UUID authorId;
    private final Long createdAt;
    private Long updatedAt;
    private String content;

    public Message(String content, UUID channelId, UUID authorId) {

        this.id = UUID.randomUUID();
        this.channelId = channelId;
        this.authorId = authorId;
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = null;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public UUID getChannelId() {
        return channelId;
    }

    public UUID getAuthorId() {
        return authorId;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public String getContent() {
        return content;
    }

    public void update(String content) {

        this.updatedAt = System.currentTimeMillis();
        this.content = content;
    }
}
