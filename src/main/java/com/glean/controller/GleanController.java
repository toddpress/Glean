package com.glean.controller;

import com.glean.entities.User;
import com.glean.guideBoxAccessLayaer.GuideBoxAPIAccessor;
import com.glean.services.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

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
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
        session.setAttribute("username", userFromDb.getUserName());
        return new ResponseEntity<User>(userFromDb, HttpStatus.OK);
    }

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public ResponseEntity<String> getShows(HttpSession session, @RequestBody Map json) throws IOException {
        String userName = (String) session.getAttribute("username");
        User user = users.findByUserName(userName);
        if (user == null) {
            return new ResponseEntity<String>(HttpStatus.FORBIDDEN);
        }
        String key = "rKb2Votbq91OfF7vWvJtcn9Q18QNAUiQ";
        String title = (String) json.get("show");
        GuideBoxAPIAccessor gbaa = new GuideBoxAPIAccessor();
        String showURL = gbaa.getShowByShowTitle(key, title);
        return new ResponseEntity<String>(showURL, HttpStatus.OK);
    }
}
