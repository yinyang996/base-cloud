package com.wuxinvip.core.repository.adapter;

import com.wuxinvip.core.repository.common.Page;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@EnableJpaRepositories
@Component
public interface JpaRepositoryAdapter<T>extends Repository<T,String> {


    @Modifying
    T save(T t);

    @Modifying
    Integer delete(Integer id);

    @Modifying
    T update(T t);

    @Query("")
    T get(T t);

    @Query("")
    List<T> list(T t);

    @Query("")
    Page<T> getPage(T t);


}
