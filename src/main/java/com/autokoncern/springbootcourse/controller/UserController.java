package com.autokoncern.springbootcourse.controller;

import com.autokoncern.springbootcourse.model.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")


public class UserController {

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)

    public UserDTO registry(@RequestBody UserDTO userDTO){

        return userDTO;

    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public UserDTO edit(@RequestBody UserDTO userDTO){

        return userDTO;
    }

    @RequestMapping(value = "/confirm/{id}", method = RequestMethod.PUT)
    public UserDTO confirm (@PathVariable(value = "id")Long id){

        return new UserDTO();

    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public UserDTO add(@RequestBody UserDTO userDTO){
        return userDTO;
    }
}
