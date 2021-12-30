package org.example.ch3.using_abstractions_with_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        CommentService commentService = context.getBean(CommentService.class);
        
        Comment comment = new Comment();
        comment.setText("test text");
        comment.setAuthor("test author");
        
        commentService.publishComment(comment);
        
        context.close();
    }

}
