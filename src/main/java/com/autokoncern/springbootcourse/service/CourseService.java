package com.autokoncern.springbootcourse.service;

import com.autokoncern.springbootcourse.model.CourseDTO;
import com.autokoncern.springbootcourse.persistence.model.Course;
import com.autokoncern.springbootcourse.persistence.repository.CourseRepo;

import java.util.List;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);
    List<CourseDTO> getAllCourses();

}
