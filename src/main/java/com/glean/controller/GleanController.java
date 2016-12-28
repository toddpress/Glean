package com.glean.controller;

import com.glean.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michaelplott on 12/17/16.
 */
@RestController
public class GleanController {

    @Autowired
    private UserRepo users;

//    @RequestMapping(path = "/login", method = RequestMethod.POST)
//    public ResponseEntity<User> postUser(HttpSession session, @RequestBody User user) {
//        if (user.userName == null) {
//            return new ResponseEntity<User>(HttpStatus.FORBIDDEN);
//        }
//        User userFromDb = users.findByUserName(user.userName);
//        if (userFromDb == null) {
//            users.save(user);
//            session.setAttribute("username", user.userName);
//            System.out.println(users.findAll());
//            return new ResponseEntity<User>(user, HttpStatus.OK);
//        }
//        session.setAttribute("username", userFromDb.userName);
//        System.out.println(userFromDb.userName);
//        System.out.println(userFromDb.password);
//        System.out.println(userFromDb.id);
//        return new ResponseEntity<User>(userFromDb, HttpStatus.OK);
//    }
}
