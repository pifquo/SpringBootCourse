package com.autokoncern.springbootcourse.service;

import com.autokoncern.springbootcourse.persistence.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface BaseService <T extends BaseEntity, K extends Serializable, R extends JpaRepository<T,K>>{

    //crud

    /*public void T (T t);
    public T read (int id);
    public T readAll (List<Integer> list);
    public void update (T t);
    public int delete (T t);
    public void delete (int id);*/

    R getRepository();

    T save (T entity);

    T delete(K id);

    Collection<T> getAll();
    T getOne(K id);
}
