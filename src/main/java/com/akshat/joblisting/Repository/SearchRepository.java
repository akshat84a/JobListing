package com.akshat.joblisting.Repository;

import com.akshat.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
