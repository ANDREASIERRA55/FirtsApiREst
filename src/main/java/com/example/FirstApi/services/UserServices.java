package example.FirstApi.services;

import example.FirstApi.models.CUser;
import example.FirstApi.repsitories.IUserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServices {
    @Autowired
    IUserRepository iUserRepository;

    public ArrayList<User> getUsers() {
        return ArrayList<Users> iUserRepository.findAll();
    }

    public ArrayList<User> getUserById(long id) {
        return ArrayList<Users> iUserRepository.findById((int) id);
    }
    public void saveOrUpdate(User user){
        iUserRepository.save(user);
    }
    public void delete(Long id){
        iUserRepository.deleteById(id);
    }

    public void delete(Long userId){
        iUserRepository.deleteById(userId);
    }




