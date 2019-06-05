package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserInfo;
import com.example.demo.repository.UserInfoRepository;
import com.example.demo.service.ResultDataImportService;

@Service
public class ResultDataImportServiceImpl implements ResultDataImportService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	public List<UserInfo> getAllUserInfo() {
		List<UserInfo> userInfo = new ArrayList<>();
		userInfoRepository.findAll().forEach(userInfo::add);
		return userInfo;

	}

	public UserInfo getTopic(String id) {
		return userInfoRepository.findOne(id);
	}

	public void insertData(UserInfo userInfo) {

		userInfoRepository.save(userInfo);
	}

	public void updatetData(String id, UserInfo userInfo) {

		userInfoRepository.save(userInfo);
	}

	public void deleteData(String id) {

		userInfoRepository.delete(id);
	}
	
	
	public List<UserInfo> getUserInfoByName(String name){
		return userInfoRepository.findByName(name);
	}

}
