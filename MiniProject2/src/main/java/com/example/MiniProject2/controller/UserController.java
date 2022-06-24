package com.example.MiniProject2.controller;

import com.example.MiniProject2.dto.ResponseDTO;
import com.example.MiniProject2.dto.UserDTO;
import com.example.MiniProject2.entity.UserEntity;
import com.example.MiniProject2.security.TokenProvider;
import com.example.MiniProject2.repository.UserRepository;
import com.example.MiniProject2.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/templates")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private TokenProvider tokenProvider;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO){
        try {
            // 리퀘스트를 이용해 저장할 유저 만들기
            UserEntity user = UserEntity.builder()
                    .phone_number(userDTO.getPhone_number())
                    .address(userDTO.getAddress())
                    .password(passwordEncoder.encode(userDTO.getPassword()))
                    .user_id(userDTO.getUser_id())
                    .build();
            // 서비스를 이용해 리파지토리에 유저 저장
            UserEntity registeredUser = userService.create(user);
            UserDTO responseUserDTO = UserDTO.builder()
                    .phone_number(registeredUser.getPhone_number())
                    .address(registeredUser.getAddress())
                    .user_id(registeredUser.getUser_id())
                    .build();
            // 유저 정보는 항상 하나이므로 그냥 리스트로 만들어야하는 ResponseDTO를 사용하지 않고 그냥 UserDTO 리턴.
            return ResponseEntity.ok(responseUserDTO);
        } catch (Exception e) {
            // 예외가 나는 경우 bad 리스폰스 리턴.
            ResponseDTO responseDTO = ResponseDTO.builder().error(e.getMessage()).build();
            return ResponseEntity
                    .badRequest()
                    .body(responseDTO);
        }
    }

    @GetMapping (value = "/userin")
    public ResponseDTO<?> signinUser(@RequestBody UserDTO userDTO) {
        UserEntity user = userService.getByCredentials(
                userDTO.getPhone_number(),
                userDTO.getPassword(),
                passwordEncoder);

        if(user != null) {
            // 토큰 생성
            final String token = tokenProvider.create(user);
            final UserDTO responseUserDTO = UserDTO.builder()
                    .phone_number(user.getPhone_number())
                    .id(user.getId())
                    .token(token)
                    .build();
            return ResponseEntity.ok().body(responseUserDTO);
        } else {
            ResponseDTO responseDTO = ResponseDTO.builder()
                    .error("Login failed.")
                    .build();
            return ResponseEntity
                    .badRequest()
                    .body(responseDTO);
        }
    }
    }

    @GetMapping(value = "/signup")
    public String signuppage() {
        return "SignUp";
    }

    @GetMapping(value = "/signin")
    public String signinpage() {
        return "SignUp";
    }

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
