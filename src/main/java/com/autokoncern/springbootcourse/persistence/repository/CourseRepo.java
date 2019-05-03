package com.autokoncern.springbootcourse.persistence.repository;

import com.autokoncern.springbootcourse.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepo extends BaseRepository<Course, Long> {
}
