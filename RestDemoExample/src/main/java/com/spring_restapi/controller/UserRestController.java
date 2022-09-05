package com.spring_restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.spring_restapi.model.User;
import com.spring_restapi.services.UserService;



@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")	
	public ResponseEntity<List<User>> getUsers() {
	        //getting users
	  List<User> users = userService.getUsers();

	        if (users == null || users.isEmpty()){
	            
	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
	        }

	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	    }
	
	@PostMapping("/users")
	public ResponseEntity<Void> create(@RequestBody User user){
       
		userService.saveUser(user);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User> update(@PathVariable ("id") int id, @RequestBody User user){
          
        userService.updateUser(user,id);
        return new ResponseEntity<User>( HttpStatus.OK);
    }
	
//	@DeleteMapping("/users/{id}")
//	public ResponseEntity<Void> delete(@PathVariable("id") int id,@RequestBody User user){
//        
//        userService.deleteUser(user,id);
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
	
	@RequestMapping(value ="/users/restapi", method = RequestMethod.GET)
	public Object get()
	{
		String url = "http://192.168.4.32:8080/RestExample/users/1";
	
		RestTemplate restTemplate = new RestTemplate();
					return restTemplate.getForObject(url, Object.class);
		
		
		
	}
}
	
	

