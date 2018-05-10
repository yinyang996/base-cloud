package com.wuxinvip.core.repository.adapter;

import com.wuxinvip.core.repository.common.Page;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MybatisRepositoryAdapter<T> {

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
