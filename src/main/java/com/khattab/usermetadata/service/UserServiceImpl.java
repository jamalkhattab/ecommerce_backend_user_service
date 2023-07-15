package com.khattab.usermetadata.service;

import com.khattab.usermetadata.entity.UserMetaData;
import com.khattab.usermetadata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserMetaData saveUserMetaData(UserMetaData userMetaData) {
        return userRepository.save(userMetaData);
    }

    public UserMetaData getUserMetaData(String uniqueId) {
        return  userRepository.findAllByUniqueId(uniqueId);
    }

    @Override
    public List<UserMetaData> getUsers() {
        return  userRepository.findAll();
    }
}
