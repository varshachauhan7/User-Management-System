package com.springboot.web.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.springboot.web.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{

	//custom finder methods or derived query methods
	public List<User> findByName(String name);
	//some more methods
	//findByNameLike(String likePattern)
	//findByNameEndingWith(String suffix)
	//findByNameStartingWith(String prefix)
	//findByNameContaining(String words)
	//findByAgeLessThan(int age)
	//findByNameOrderByName(String name)
	//findByAgeIn(Collection<Integer> ages)
	//more methods on----->https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
}
