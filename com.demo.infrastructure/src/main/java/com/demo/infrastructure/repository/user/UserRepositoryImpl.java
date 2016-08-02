package com.demo.infrastructure.repository.user;

import java.util.List;

import com.demo.domainmodel.user.User;
import com.demo.domainmodel.user.UserRepository;

import easy.domain.repository.framework.IDao;

public class UserRepositoryImpl implements UserRepository, IDao {

	@Override
	public void add(User arg0) {
		System.out.println("添加成功");
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findBy(Integer[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findBy(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(User arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User arg0) {
		// TODO Auto-generated method stub

	}

}
