package org.example.ch4.using_abstractions_without_spring;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment);
    }
}
