package com.codewithganesh.blog.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithganesh.blog.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}





//package com.codewithganesh.blog.repo;
//
//
//import java.io.Serializable;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.codewithganesh.blog.binding.Course;
//
//public interface CourseRepository extends JpaRepository<Course, Serializable> {
//
//}
