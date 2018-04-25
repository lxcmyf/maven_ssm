package cn.lxc.mapper;

import java.util.List;

import cn.lxc.vo.User;

public interface UserMapper {
	public List<User> getList();

	public int delete(int id);
	
	public int save(User user);

	public User getEntity(int id);

	public int update(User user);
}
