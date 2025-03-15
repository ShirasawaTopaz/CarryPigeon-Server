package com.carrypigeon.server.mapper;

import lombok.Data;

@Data
public class MessageMapper {

    private long sessionsId;
    private String messageContent;
    private String date;
    private long fromUserId;
    private long toUserId;
    private long messageId;
}
