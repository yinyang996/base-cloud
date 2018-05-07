package com.wuxinvip.project.mapper;

import com.wuxinvip.project.model.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by 无心 on 2017/11/29.
 */
@Component
public interface ItemDao {

    ArrayList<Item> listItem();

}
