package com.cavluni.wsmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cavluni.wsmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
	
}
