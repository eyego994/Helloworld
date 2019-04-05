package com.example.service;

import javax.servlet.http.HttpServletRequest;

import com.example.model.Users;
import com.example.repository.UsersRepository;

public class JoinService {

	
	public void joinUser(HttpServletRequest request, UsersRepository userRepository) {
		
		
		//html 페이지에서 받는 정보를 객체에 저
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		String userName = request.getParameter("user_name");
		
		//users 라는 객체에 각 id, pw, name를 넣고 
		Users users = new Users();
		users.setUser_id(userId);
		users.setUser_pw(userPw);
		users.setUser_name(userName);
		
		//저장소에 저
		userRepository.save(users);
		
		
	}
	
}
