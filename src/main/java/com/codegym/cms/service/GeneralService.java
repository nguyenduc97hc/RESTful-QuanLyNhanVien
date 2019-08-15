package com.codegym.cms.service;

import java.util.List;

public interface GeneralService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);
}
