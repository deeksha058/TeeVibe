package com.TeeVibes.TeeVibe.controller;

import com.TeeVibes.TeeVibe.dto.ResponseDto;
import com.TeeVibes.TeeVibe.dto.user.SignInDto;
import com.TeeVibes.TeeVibe.dto.user.SignInResponseDto;
import com.TeeVibes.TeeVibe.dto.user.SignupDto;
import com.TeeVibes.TeeVibe.exceptions.AuthenticationFailException;
import com.TeeVibes.TeeVibe.exceptions.CustomException;
import com.TeeVibes.TeeVibe.model.User;
import com.TeeVibes.TeeVibe.repository.UserRepository;
import com.TeeVibes.TeeVibe.service.AuthenticationService;
import com.TeeVibes.TeeVibe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> findAllUser(@RequestParam("token") String token) throws AuthenticationFailException {
        authenticationService.authenticate(token);
        return userRepository.findAll();
    }

    @PostMapping("/signup")
    public ResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    //TODO token should be updated
    @PostMapping("/signIn")
    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException {
        return userService.signIn(signInDto);
    }

//    @PostMapping("/updateUser")
//    public ResponseDto updateUser(@RequestParam("token") String token, @RequestBody UserUpdateDto userUpdateDto) {
//        authenticationService.authenticate(token);
//        return userService.updateUser(token, userUpdateDto);
//    }


//    @PostMapping("/createUser")
//    public ResponseDto updateUser(@RequestParam("token") String token, @RequestBody UserCreateDto userCreateDto)
//            throws CustomException, AuthenticationFailException {
//        authenticationService.authenticate(token);
//        return userService.createUser(token, userCreateDto);
//    }
}
