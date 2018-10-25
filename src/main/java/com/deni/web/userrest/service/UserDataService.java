package com.deni.web.userrest.service;

import com.deni.web.userrest.domain.UserList;
import org.springframework.web.client.RestTemplate;

public interface UserDataService {

    UserList getUserData(int limit);
}
