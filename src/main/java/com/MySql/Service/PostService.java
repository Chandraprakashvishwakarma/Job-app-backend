package com.MySql.Service;

import com.MySql.Model.Post;

import java.util.List;

public interface PostService {
    public Post savePost(Post post);
    public List<Post> getAllPosts();
}
