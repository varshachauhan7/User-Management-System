package com.springboot.web;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;

@SpringBootApplication
 public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
	
	UserRepository userRepository = (UserRepository) context.getBean(UserRepository.class);
	
//	//Create object of user
//	User user1= new User();
//	user1.setName("Varsha Chauhan");
//	user1.setCity("Rewari");
//	user1.setStatus("I am a Java Programmer");
//	
//	//saving single user
//	//User resultUser = userRepository.save(user1);
//	//System.out.println(resultUser);
//	
//	User user2= new User();
//	user2.setName("Sunny Chauhan");
//	user2.setCity("Rewari");
//	user2.setStatus("I am a Java Programmer");
//	
//	List<User> users=List.of(user1,user2);
//	//saving multiple user
//	Iterable<User> result = userRepository.saveAll(users);
//	
//	//printing users
//	result.forEach(user->{
//		System.out.println(user);
//		
//	});
//	System.out.println("done");
//	
	
//	//update the user
//	 Optional<User> optional=userRepository.findById(203);
//	 User user = optional.get();
//	 user.setStatus("I am a Java Expert");
//	 User result =userRepository.save(user);
//	 System.out.println(result);
	
	//How to get the data
	//findById(id)- return Optional Containing your data
	//2nd method:
//	Iterable<User> itr =  userRepository.findAll();
//	//Shortest way for 2nd method using lambda function
//		itr.forEach(user->{System.out.println(user);});
		
	//older way of implementing 2nd method:
//	Iterator<User> iterator =  itr.iterator();
//	
//	while(iterator.hasNext())
//	{
//		User user = iterator.next();
//		System.out.println(user);
//	}
	
//	//2nd method by using newer way:
//	itr.forEach(new Consumer<User>() {
//		public void accept(User t) {
//			
//			System.out.println(t);
//		}
//		
//	});
		
	
	
	//Deleting the user element
//	//ist way:
//	userRepository.deleteById(202);
//	System.out.println("deleted");
	
//	//2nd way:
//	Iterable<User>  allusers = userRepository.findAll();
//	allusers.forEach(user->System.out.println(user));
//	userRepository.deleteAll(allusers);
	
	List<User> users = userRepository.findByName("Sunny Chauhan");
	users.forEach(e->System.out.println(e));
	}

}
