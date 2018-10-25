package com.deni.web.userrest.service;

import com.deni.web.userrest.domain.UserList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserDataServiceImpl implements UserDataService {

    RestTemplate restTemplate;

    public UserDataServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public UserList getUserData(int limit) {
        UserList userList = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserList.class);
        return userList;
    }
}
