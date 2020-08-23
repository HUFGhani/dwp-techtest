package io.gitub.hufghani.dwptechtest.hystrix;

import io.gitub.hufghani.dwptechtest.feign.Client;
import io.gitub.hufghani.dwptechtest.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UsersFallback implements Client {

  @Override
  public List<User> retrieveAllUsers() {
    return new ArrayList<>();
  }

  @Override
  public List<User> retrieveLondonUsers() {
    return new ArrayList<>();
  }

  @Override
  public User retrieveUsersById(Integer id) {
    return new User();
  }
}
