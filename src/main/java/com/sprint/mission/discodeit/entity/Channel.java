package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Channel {

    private final UUID id;
    private final Long createdAt;
    private final ChannelType type;
    private Long updatedAt;
    private String name;
    private String description;

    public Channel(ChannelType type, String name, String description) {

        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.type = type;
        this.updatedAt = null;
        this.name = name;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public ChannelType getType() {
        return type;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void update(String name, String description) {

        this.updatedAt = System.currentTimeMillis();
        this.name = name;
        this.description = description;
    }
}
