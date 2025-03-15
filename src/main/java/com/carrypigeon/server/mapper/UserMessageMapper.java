package com.carrypigeon.server.mapper;

import lombok.Data;

@Data
public class UserMessageMapper {

    private String token;
    private long sessionsId;
    private String messageContent;
    private long fromUserId;
    private long toUserId;
    private long messageId;
}
