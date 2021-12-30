package org.example.ch4.using_abstractions_without_spring;

public class Main {

	public static void main(String[] args) {
	    CommentRepository commentRepository = new DBCommentRepository();
	    CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificatificationProxy();
	    
	    CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
	    
	    Comment comment = new Comment();
	    comment.setText("text");
	    comment.setAuthor("author");
	    
        commentService.publishComment(comment);
	}
}
