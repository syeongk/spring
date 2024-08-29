package org.spring.services;

import org.spring.repositories.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        System.out.println("UserService instance created!");
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
