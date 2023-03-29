package com.akshat.joblisting.Repository;

import com.akshat.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
