package com.codewithganesh.blog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithganesh.blog.Service.CourseService;
import com.codewithganesh.blog.binding.Course;

@RestController
public class CourseRestController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course)
	{
	      String status = courseService.upsert(course);
	      return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course>  getCourse(@PathVariable Integer cid)
	{
	       Course status = courseService.getById(cid);
	       return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourse()
	{
		List<Course> status = courseService.getAllCourses();
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<String> updateCourse(@RequestBody Course course)
	{
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	
	@DeleteMapping
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid)
	{
		String status = courseService.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	
}
