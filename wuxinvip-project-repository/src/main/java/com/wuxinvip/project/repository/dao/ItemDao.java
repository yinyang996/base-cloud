package com.wuxinvip.project.repository.dao;


import com.wuxinvip.core.repository.service.BaseRepository;
import com.wuxinvip.project.model.Item;

import java.util.List;

public interface ItemDao extends BaseRepository<Item> {

        List<Item> getItemById(Integer id);
}
