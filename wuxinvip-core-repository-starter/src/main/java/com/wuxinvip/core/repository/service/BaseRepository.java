package com.wuxinvip.core.repository.service;


import com.wuxinvip.core.repository.common.Page;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface BaseRepository<T> extends Repository<T,String> {



    T save(T t);

    Integer delete(Integer id);

    T update(T t);

    T get(T t);

    List<T> list(T t);

    Page<T> getPage(T t);



}
