package com.wuxinvip.core.repository.service.impl;

import com.wuxinvip.core.repository.config.CoreRepositoryConfig;
import com.wuxinvip.core.repository.adapter.JpaRepositoryAdapter;
import com.wuxinvip.core.repository.adapter.MybatisRepositoryAdapter;
import com.wuxinvip.core.repository.common.Page;
import com.wuxinvip.core.repository.service.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class BaseRepositoryImpl<T> implements BaseRepository<T> {


    private CoreRepositoryConfig coreRepositoryConfig;


    @Autowired
    private MybatisRepositoryAdapter mybatisRepositoryAdapter;


    @Autowired
    private JpaRepositoryAdapter jpaRepositoryAdapter;


    @Override
    public T save(T t) {

        switch (coreRepositoryConfig.getConfig()){

            case "mybatis":
                return (T) this.mybatisRepositoryAdapter.save(t);
            case "jpa":
                return (T) this.jpaRepositoryAdapter.save(t);
            default:
                break;
        }
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        switch (coreRepositoryConfig.getConfig()){

            case "mybatis":
                return this.mybatisRepositoryAdapter.delete(id);
            case "jpa":
                return this.jpaRepositoryAdapter.delete(id);

            default:
                break;
        }
        return null;
    }

    @Override
    public T update(T t) {
        switch (coreRepositoryConfig.getConfig()){

            case "mybatis":
                return (T) this.mybatisRepositoryAdapter.update(t);
            case "jpa":
                return (T) this.jpaRepositoryAdapter.update(t);
            default:
                break;
        }
        return null;
    }

    @Override
    public T get(T t) {
        switch (coreRepositoryConfig.getConfig()){

            case "mybatis":
                return (T) this.mybatisRepositoryAdapter.get(t);
            case "jpa":
                return (T) this.jpaRepositoryAdapter.get(t);
            default:
                break;
        }
        return null;
    }

    @Override
    public List list(T t) {
        switch (coreRepositoryConfig.getConfig()){

            case "mybatis":
                return this.mybatisRepositoryAdapter.list(t);
            case "jpa":
                return this.jpaRepositoryAdapter.list(t);
            default:
                break;
        }
        return null;
    }

    @Override
    public Page getPage(T t) {
        switch (coreRepositoryConfig.getConfig()){

            case "mybatis":
                return this.mybatisRepositoryAdapter.getPage(t);
            case "jpa":
                return this.jpaRepositoryAdapter.getPage(t);
            default:
                break;
        }
        return null;
    }

}
