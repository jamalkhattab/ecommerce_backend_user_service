package com.khattab.usermetadata.repository;

import com.khattab.usermetadata.entity.UserMetaData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserMetaData, Long> {
    UserMetaData save(UserMetaData userMetaData);
    UserMetaData findAllByUniqueId(String userId);
}
