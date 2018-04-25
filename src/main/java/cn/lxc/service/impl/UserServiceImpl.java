package cn.lxc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lxc.mapper.UserMapper;
import cn.lxc.service.UserService;
import cn.lxc.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getList() {
		return userMapper.getList();
	}
	@Override
	public int delete(int id) {
		return userMapper.delete(id);
	}
	@Override
	public int save(User user) {
		return userMapper.insert(user);
		
	}
	@Override
	public User showInfoById(int id) {
		return userMapper.selectByPk(id);
	}
	@Override
	public int update(User user) {
		return userMapper.update(user);
	}
}
