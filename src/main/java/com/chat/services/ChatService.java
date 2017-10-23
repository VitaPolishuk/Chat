package com.chat.services;

import com.chat.dao.ChatRepository;
import com.chat.entities.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ChatService {
    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public void save(Chat chat) {
        chatRepository.save(chat);
    }

}