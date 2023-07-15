package com.khattab.usermetadata.service;

import com.khattab.usermetadata.entity.UserMetaData;

import java.util.List;

public interface UserService {
    public UserMetaData saveUserMetaData(UserMetaData userMetaData);
    public UserMetaData getUserMetaData(String uniqueId);

    List<UserMetaData> getUsers();
}
