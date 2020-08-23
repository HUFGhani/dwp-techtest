package io.gitub.hufghani.dwptechtest.feign;

import io.gitub.hufghani.dwptechtest.model.User;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bpdts", url = "https://dwp-techtest.herokuapp.com/")
public interface Client {
  @GetMapping(value = "/users")
  List<User> retrieveAllUsers();

  @GetMapping(value = "/city/London/users")
  List<User> retrieveLondonUsers();

  @GetMapping(value = "/user/{id}")
  User retrieveUsersById(@PathVariable("id") Integer id);
}
