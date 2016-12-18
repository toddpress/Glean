package com.glean.controller;

import com.glean.entities.User;
import com.glean.services.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by michaelplott on 12/17/16.
 */
@RestController
public class GleanController {

    @Autowired
    private UserRepo users;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ResponseEntity<User> postUser(HttpSession session, @RequestBody User user) {
        if (user.getUserName() == null) {
            return new ResponseEntity<User>(HttpStatus.FORBIDDEN);
        }
        User userFromDb = users.findByUserName(user.getUserName());
        if (userFromDb == null) {
            users.save(user);
            session.setAttribute("username", user.getUserName());
            System.out.println(users.findAll());
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
        session.setAttribute("username", userFromDb.getUserName());
        System.out.println(userFromDb.getUserName());
        System.out.println(userFromDb.getPassword());
        System.out.println(userFromDb.getId());
        return new ResponseEntity<User>(userFromDb, HttpStatus.OK);
    }
}
