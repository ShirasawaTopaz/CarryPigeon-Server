package com.carrypigeon.server.controller;

import com.carrypigeon.server.dto.ws.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/message") // 处理/carrypigeon/message路径的消息
    @SendTo("/topic/messages") // 将返回值发送到/topic/messages
    public Message sendMessage() {
        return new Message();
    }
}
