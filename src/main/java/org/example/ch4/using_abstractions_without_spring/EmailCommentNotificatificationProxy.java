package org.example.ch4.using_abstractions_without_spring;

public class EmailCommentNotificatificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment);
    }
}
