package com.service.service;

import com.service.service.dao.ImagesDao;
import com.service.service.model.Images;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoServiceApplicationTests {
    @Autowired
    private ImagesDao imageDao;
    @Test
    public void contextLoads() {
    }

}
