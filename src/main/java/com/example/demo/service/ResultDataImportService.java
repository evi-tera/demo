package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.UserInfo;

public interface ResultDataImportService {

	public List<UserInfo> getAllUserInfo();

	public UserInfo getTopic(String id);

	public void insertData(UserInfo userInfo);

	public void updatetData(String id, UserInfo userInfo);

	public void deleteData(String id);
	
	public List<UserInfo> getUserInfoByName(String name);
}
