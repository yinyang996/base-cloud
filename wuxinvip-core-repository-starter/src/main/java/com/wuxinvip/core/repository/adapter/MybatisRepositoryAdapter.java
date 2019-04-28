package com.wuxinvip.core.repository.adapter;

import com.wuxinvip.core.repository.common.Page;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;

import java.util.List;

@Mapper
public interface MybatisRepositoryAdapter<T> extends Repository<T,String> {

    @Insert("")
    T save(T t);

    @Delete("")
    Integer delete(Integer id);

    @Update("")
    T update(T t);

    @Select("")
    T get(T t);

    @Select("")
    List<T> list(T t);

    @Select("")
    Page<T> getPage(T t);

}
