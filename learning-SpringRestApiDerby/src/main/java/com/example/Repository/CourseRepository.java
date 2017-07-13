package com.example.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {
	
//	public List <Course> getCourseByTopic(String topicId);
//	public List <Course> findByName(String name);
	public List <Course> findByTopicId(String topicId);
	

}
