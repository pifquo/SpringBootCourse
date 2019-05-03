package com.autokoncern.springbootcourse.persistence.repository;

import com.autokoncern.springbootcourse.persistence.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface BaseRepository <T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T, K>, JpaSpecificationExecutor<T> {
}
