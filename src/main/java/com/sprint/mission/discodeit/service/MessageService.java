package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Message;

import java.util.UUID;
import java.util.List;

public interface MessageService {

    Message create(String content, UUID channelId, UUID authorId);

    Message find(UUID messageId);

    List<Message> findAll();

    Message update(UUID messageId, String content);

    void delete(UUID messageId);
}
