package com.carrypigeon.server.controller;

import com.carrypigeon.server.mapper.MessageMapper;
import com.carrypigeon.server.mapper.UserMessageMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/send-message")
public class SendMessageController {

    @PostMapping
    public String sendMessage(@RequestBody String message) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            UserMessageMapper userMessageMapper = objectMapper.readValue(
                message,
                UserMessageMapper.class
            ); // 反序列化用户发送的JSON
            //if userMessageMapper.getToken() {} //TODO: 用户鉴权

            MessageMapper messageMapper = new MessageMapper();
            // 将UserMessageMapper中的数据转移至MessageMapper以存储于数据库中
            messageMapper.setSessionsId(userMessageMapper.getSessionsId());
            messageMapper.setMessageContent(
                userMessageMapper.getMessageContent()
            );
            messageMapper.setMessageId(userMessageMapper.getMessageId());
            messageMapper.setFromUserId(userMessageMapper.getFromUserId());
            messageMapper.setToUserId(userMessageMapper.getToUserId());
            messageMapper.setDate(LocalDateTime.now().toString());

            //处理存储数据库
            return "Message sent!";
        } catch (Exception e) {
            log.error("", e);
            return "Error!";
        }
    }
}
