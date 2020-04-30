package com.cavluni.wsmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cavluni.wsmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	@Query("{ 'title' : { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);

	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{$and")
	List<Post> fullSearch (String text, Date minDate, Date maxDate);
	
}
