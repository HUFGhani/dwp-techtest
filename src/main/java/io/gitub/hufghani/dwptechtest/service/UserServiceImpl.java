package io.gitub.hufghani.dwptechtest.service;

import io.gitub.hufghani.dwptechtest.feign.Client;
import io.gitub.hufghani.dwptechtest.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private Client dwpClient;

  @Override
  public List<User> getAllUsers() {
    return dwpClient.retrieveAllUsers();
  }
}
