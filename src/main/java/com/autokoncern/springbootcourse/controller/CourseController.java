package com.autokoncern.springbootcourse.controller;

import com.autokoncern.springbootcourse.model.CourseDTO;
import com.autokoncern.springbootcourse.exception.WrongIdException;
import com.autokoncern.springbootcourse.persistence.model.Course;
import com.autokoncern.springbootcourse.persistence.repository.CourseRepo;
import com.autokoncern.springbootcourse.service.CourseService;
import com.autokoncern.springbootcourse.service.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    private List<CourseDTO> cours = new ArrayList<>();

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO) {
        if (courseDTO.getId() != null)
            throw new WrongIdException("Tworzony kurs nie powinien posiadać ID");
        System.out.println("/course/create" + courseDTO.getName());
        CourseDTO dto = courseService.createCourse(courseDTO);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ResponseEntity<List<CourseDTO>> getAvailableCourses() {
        courseService.getAll();
        return new ResponseEntity<>(cours, HttpStatus.OK);
    }

    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
    public CourseDTO buyCaourse(@PathVariable(value = "id") Long id) {
        System.out.println("buyCourse");
        Course course = new Course();
        course.setName("ccc1");
        courseService.save(course);
        return null;
    }


    @RequestMapping(value = "buy2", method = RequestMethod.POST)
    public CourseDTO buyCaourse2(@RequestParam(value = "id") Long id) {
        System.out.println("buyCourse2");
        return getCourse(id);
    }

        /*@RequestMapping(value = "/bought", method = RequestMethod.GET) FIXME
        public ResponseEntity<List<CourseDTO>> getBoughtCourses (){

            return new ResponseEntity<>(cours, HttpStatus.CREATED);
        }*/


    private CourseDTO getCourse(Long id) {
        CourseDTO courseDTO = null;
        for (CourseDTO c : cours) {
            if (c.getId() != null && c.getId().equals(id)) {
                courseDTO = c;
                break;
            }
        }
        if (courseDTO == null) {

        }
        return courseDTO;
    }
}