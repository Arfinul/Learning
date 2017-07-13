package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	

}
