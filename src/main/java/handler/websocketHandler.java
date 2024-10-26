package handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

@Slf4j
@Component
public class websocketHandler extends TextWebsocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage textMessage) throws Exception{
        String payload = textMessage.getPayload();
        log.info("payload {}", payload);
        TextMessage welcometextMessage = new TextMessage("채팅에 참가하셨습니다.");
        session.sendMessage(welcometextMessage);
    }
}