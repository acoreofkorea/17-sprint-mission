package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.entity.ChannelType;

import java.util.UUID;
import java.util.List;

public interface ChannelService {

    Channel create(ChannelType type, String name, String description);

    Channel find(UUID channelId);

    List<Channel> findAll();

    Channel update(UUID channelId, String name, String description);

    void delete(UUID channelId);
}
