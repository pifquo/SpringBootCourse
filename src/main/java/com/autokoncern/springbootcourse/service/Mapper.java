package com.autokoncern.springbootcourse.service;

import com.autokoncern.springbootcourse.model.CourseDTO;
import com.autokoncern.springbootcourse.persistence.model.Course;

public class Mapper {

    public static CourseDTO courseToDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setName(course.getName());

        return courseDTO;
    }

    public static Course dtoToCourse(CourseDTO courseDTO) {
        Course course = new Course();
        course.setId(courseDTO.getId());
        return course;

    }
}
