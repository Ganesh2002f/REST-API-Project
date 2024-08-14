package com.codewithganesh.blog.Service;

import java.util.List;

import com.codewithganesh.blog.binding.Course;


public interface CourseService {

	
	
	
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	
	public String deleteById(Integer cid);

}




