package com.codeup.blog.repositories;

import com.codeup.blog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}