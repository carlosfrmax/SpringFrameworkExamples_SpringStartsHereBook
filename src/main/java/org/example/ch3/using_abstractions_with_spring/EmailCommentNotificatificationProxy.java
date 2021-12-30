package org.example.ch3.using_abstractions_with_spring;

import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificatificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment);
    }
}
