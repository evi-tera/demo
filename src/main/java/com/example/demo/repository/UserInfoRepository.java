package com.example.demo.repository;
import com.example.demo.bean.UserInfo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoRepository extends CrudRepository<UserInfo, String> {

	@Query("select userInfo from UserInfo userInfo where userInfo.name=?1")
    public List<UserInfo> findByName(String name);
}
