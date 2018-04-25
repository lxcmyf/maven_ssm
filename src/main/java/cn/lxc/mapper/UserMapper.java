package cn.lxc.mapper;

import java.util.List;

import cn.lxc.vo.User;

public interface UserMapper {
	public List<User> getList();

	public int delete(int id);
	
	public int insert(User user);

	public User selectByPk(int id);

	public int update(User user);
}
