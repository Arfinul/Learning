package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.CourseRepository;
import com.example.model.Course;

@Service
public class CourseService{
	
	@Autowired
	private CourseRepository courseRepository;
	
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//	    		new Topic ("spring", "spring framework", "spring framework description"),
//	    		new Topic ("java", "core java", "core java description"),
//	    		new Topic ("javascript", "ssimple javascript", "javascript description")
//	    		));
    
	
	public List<Course> getAllCourses(String topicId )
    {
//  	    return topics;
//		List<Topic>topics = new ArrayList<>();
//		topicRepository.findAll()
//		.forEach(topics::add);
//		return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
    }
	
	 public Course getCourse(String id){
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); 
		
		 return courseRepository.findOne(id);
	  }

	public void addCourse(Course course) {
//		topics.add(topic);
		courseRepository.save(course);
	  }

	public void updateCourse(Course course) {
//		for(int i=0;i<topics.size();i++){
//			Topic t=topics.get(i);
//			if(t.getId().equals(id)){
//				topics.set(i,topic);
//				return;
        courseRepository.save(course);
				
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		 courseRepository.delete(id);
		
	}
}
