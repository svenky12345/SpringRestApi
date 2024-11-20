package com.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entities.Course;

@Service

public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(145,"Java Core Courses","This course contains basic java"));
		list.add(new Course(4343,"SpringBoot Course","Creating RestAPI using SpringBoot"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course: list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
		
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
