package io.gitub.hufghani.dwptechtest.service;

import io.gitub.hufghani.dwptechtest.feign.Client;
import io.gitub.hufghani.dwptechtest.model.User;
import io.gitub.hufghani.dwptechtest.util.Utilities;
import java.util.ArrayList;
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

  @Override
  public List<User> getUserFromLondon() {
    return dwpClient.retrieveLondonUsers();
  }

  @Override
  public List<User> getLondonUsersByDistance(double distance) {
    List<User> allUsers = dwpClient.retrieveAllUsers();
    List<User> result = new ArrayList<>();

    allUsers.forEach(
        user -> {
          double distanceMiles = Utilities.distanceCal(user.getLatitude(), user.getLongitude());
          if (distanceMiles <= distance) result.add(user);
        });

    return result;
  }
}
