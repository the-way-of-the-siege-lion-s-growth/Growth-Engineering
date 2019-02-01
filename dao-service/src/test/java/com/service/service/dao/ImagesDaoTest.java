package com.service.service.dao;

import com.service.service.model.Images;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ImagesDaoTest {
    @Autowired
    private ImagesDao imageDao;
    @Test
    public void save() {

        System.out.println(imageDao);
        for (int i =1;i<11;i++){
            Images images = new Images();
            images.setName("图片"+i);
            images.setFileKey(UUID.randomUUID().toString());
            imageDao.save(images);
        }
    }

    @Test
    public void getAll() {
    }
}