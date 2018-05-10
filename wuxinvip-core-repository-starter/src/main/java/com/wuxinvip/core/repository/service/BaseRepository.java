package com.wuxinvip.core.repository.service;


import com.wuxinvip.core.repository.common.Page;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BaseRepository<T> {



    T save(T t);

    Integer delete(Integer id);

    T update(T t);

    T get(T t);

    List<T> list(T t);

    Page<T> getPage(T t);



}
