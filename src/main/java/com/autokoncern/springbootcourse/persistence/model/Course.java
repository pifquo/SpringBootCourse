package com.autokoncern.springbootcourse.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="courses")

public class Course extends BaseEntity{



    @Column(name = "name")
    private String name;

}
