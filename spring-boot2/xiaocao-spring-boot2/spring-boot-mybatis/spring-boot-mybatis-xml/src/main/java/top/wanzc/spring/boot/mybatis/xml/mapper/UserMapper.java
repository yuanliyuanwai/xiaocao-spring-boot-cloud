package top.wanzc.spring.boot.mybatis.xml.mapper;

import java.util.List;

import top.wanzc.spring.boot.mybatis.xml.model.User;

public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}