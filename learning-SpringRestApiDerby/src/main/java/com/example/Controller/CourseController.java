package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CourseService;
import com.example.model.Course;
import com.example.model.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	  @RequestMapping("/topics/{id}/courses")
	  //public String getAllTopics()
      public List<Course> getAllCourses(@PathVariable String id)
      {
    	//  return "All Topics";
		    return //Arrays.asList(
		    		//new Topic ("spring", "spring framework", "spring framework description"),
		    		//new Topic ("java", "core java", "core java description"),
		            //new Topic ("javascript", "ssimple javascript", "javascript description"));
		    		
		    		courseService.getAllCourses(id);
		    
		
      }
	  
	  @RequestMapping("/topics/{topicId}/courses/{id}")
	  public Course getCourse(@PathVariable String id){
		  return courseService.getCourse(id);
	  }
	  
	  @RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	  public void addCourse(@RequestBody Course course, @PathVariable String topicId){
		  course.setTopic(new Topic(topicId,"",""));
		  courseService.addCourse(course);  
	  } 
	  
	  @RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	  public void updateTopic(@RequestBody Course course, @PathVariable String topicId){
		  course.setTopic(new Topic(topicId,"",""));
		  courseService.updateCourse(course);
	  }
	  
	  @RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
	  public void deleteTopic(@PathVariable String id){
		  courseService.deleteCourse(id);
	  }
	  
	  
}
