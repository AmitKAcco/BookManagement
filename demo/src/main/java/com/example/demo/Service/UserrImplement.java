package com.example.demo.Service;

import com.example.demo.Pojo.Userr;
import com.example.demo.Repositry.UserrRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserrImplement implements UserrInterface{

    @Autowired
    private UserrRepo userrRepo;

    @Override
    public Userr createUserr(Userr userr) {
        return this.userrRepo.save(userr);
    }

    @Override
    public Userr updateUserr(Userr userr) {
        Optional<Userr> userObj = this.userrRepo.findById(userr.getUserId());
        if(userObj.isPresent()){
            Userr updatedUser = userObj.get();
            updatedUser.setEmail(userr.getEmail());
            updatedUser.setPhoneNO(userr.getPhoneNO());
            updatedUser.setStatus(userr.isStatus());
            updatedUser.setUserName(userr.getUserName());
            return this.userrRepo.save(updatedUser);
        } else {
            throw new RuntimeException("user does not exist");
        }
    }

    @Override
    public List<Userr> getAllUserr() {
        return this.userrRepo.findAll();
    }



    @Override
    public Userr getUserrById(long userId) {
        Optional<Userr> user = this.userrRepo.findById(userId);
        if(user.isPresent()){
            return user.get();
        } else{
            throw new RuntimeException("User does not exist");
        }
    }




    public void deleteUserr(long id) {
        Optional<Userr> user = this.userrRepo.findById(id);
        if(user.isPresent()){
            this.userrRepo.deleteById(id);
        } else {
            throw new RuntimeException("User does not exist");
        }
    }
}
