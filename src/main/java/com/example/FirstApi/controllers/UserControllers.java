package example.FirstApi.controllers;

import example.FirstApi.services.UserServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserControllers {
  @Autowired
    UserServices userServices;
  @GetMapping()
    public ArrayList<User> getUsers() {
    return userServices.getUsers();
  }
  @GetMapping(path = "/{id}")
    public ArrayList<User> getUserById(@PathVariable ("userId")long id) {
    return userServices.getUserById(id);
  }
  @GetMapping()
    public ArrayList<User> getAll() {
    return userServices.getUsers();
  }
  @PostMapping()
    public void saveUpdate (@RequestBody.Users users) {
    userServices.saveOrUpdate(users);
  }
  @DeleteMapping(path = "/{UserId}")
    public void saveUpdate(@PathVariable("userId")Long userId){
    userServices.delete(userId);
  }
}
