package io.gitub.hufghani.dwptechtest.service;

import io.gitub.hufghani.dwptechtest.model.User;
import java.util.List;

public interface UserService {

  List<User> getAllUsers();

  List<User> getUserFromLondon();

  List<User> getLondonUsersByDistance(double distance);

  User getUserById(int id);
}
