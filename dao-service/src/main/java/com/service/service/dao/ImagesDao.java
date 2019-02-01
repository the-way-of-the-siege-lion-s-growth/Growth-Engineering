package com.service.service.dao;

import com.service.service.model.Images;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ImagesDao {
    /**
     * 增加一张图片
     * @return
     */
    Long save(Images image);


    /**
     * 获取所有的图片信息
     * @return
     */
    List<Images> getAll();


}
