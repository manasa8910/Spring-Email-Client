package com.example.springEmailClient.kafka;

import com.example.springEmailClient.EmailSenderService;
import com.example.springEmailClient.modal.NotificationModal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @Autowired
    private EmailSenderService service;

    @Autowired
    ObjectMapper objectMapper;

    @KafkaListener(topics = "task", groupId = "my-group")  //subscribe to the topic...
    public void consume(String data) throws JsonProcessingException {//spring kafka provided JSonDeserializer will convert User Json object to notificationModal java object

        String newline = System.getProperty("line.separator");

        NotificationModal notificationModal = objectMapper.readValue(data, NotificationModal.class);
        service.sendSimpleEmail("catscratchthat@gmail.com",
                notificationModal.getNotificationMessage() + newline + newline
                        + "name: " + notificationModal.getName() + newline
                        + "description: " + notificationModal.getDescription() + newline
                        + "dueDate: " + notificationModal.getDueDate().toString() + newline
                        + "priority: " + notificationModal.getPriority().toString() + newline
                        + "createdBy: " + notificationModal.getCreatedBy().toString() + newline
                        + "assignedTo: " + notificationModal.getAssignedTo().toString() + newline
                        + "project: " + notificationModal.getProject() + newline
                        + "category: " + notificationModal.getCategory() + newline
                        + "status: " + notificationModal.getStatus() + newline
                , "Task notification");
    }
}
