package io.gitub.hufghani.dwptechtest.controller;

import io.gitub.hufghani.dwptechtest.model.User;
import io.gitub.hufghani.dwptechtest.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
  @Autowired private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users")
  @ApiOperation(value = "View all users", response = User.class)
  @ApiResponses(
      value = {
        @ApiResponse(code = 200, message = "Success|OK", response = User.class),
        @ApiResponse(code = 401, message = "not authorized!"),
        @ApiResponse(code = 403, message = "forbidden!!!"),
        @ApiResponse(code = 404, message = "not found!!!")
      })
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }
}
