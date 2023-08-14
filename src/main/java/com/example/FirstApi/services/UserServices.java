package example.FirstApi.services;

import example.FirstApi.models.CUser;
import example.FirstApi.repsitories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    IUserRepository IUserRepository;

    public CUser getById(int id){
        return (CUser) IUserRepository.findById(id).orElse(null);
    }
    public CUser saveUser(CUser userModel){
        return IUserRepository.save(userModel);

    }
}


