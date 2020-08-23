package io.gitub.hufghani.dwptechtest.feign;

import io.gitub.hufghani.dwptechtest.config.ClientConfiguration;
import io.gitub.hufghani.dwptechtest.hystrix.UsersFallback;
import io.gitub.hufghani.dwptechtest.model.User;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "dwp",
    url = "https://dwp-techtest.herokuapp.com/",
    configuration = ClientConfiguration.class,
    fallback = UsersFallback.class)
public interface Client {
  @GetMapping(value = "/users")
  List<User> retrieveAllUsers();

  @GetMapping(value = "/city/London/users")
  List<User> retrieveLondonUsers();

  @GetMapping(value = "/user/{id}")
  User retrieveUsersById(@PathVariable("id") Integer id);
}
