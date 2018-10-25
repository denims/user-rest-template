package com.deni.web.userrest.service;

import com.deni.web.userrest.domain.UserList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDataServiceTest {
    @Autowired
    UserDataService userDataService;

    @Test
    public void givenLimitAsThree_ShouldreturnFourUsers_WhenUsingGetUserData() {
        UserList userList = userDataService.getUserData(3);
        assertEquals(4, userList.getData().size());

    }

}