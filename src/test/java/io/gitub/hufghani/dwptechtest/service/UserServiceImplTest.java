package io.gitub.hufghani.dwptechtest.service;

import static org.mockito.Mockito.when;

import io.gitub.hufghani.dwptechtest.feign.Client;
import io.gitub.hufghani.dwptechtest.model.User;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceImplTest {
  @Mock Client dwpClient;
  @InjectMocks UserServiceImpl userServiceImpl;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  void testGetAllUsers() {
    List<User> expected = new ArrayList<>();
    expected.add(
        new User(1, "Bob", "Smith", "bob.smith@test.com", "192.57.232.111", 51.509865, -0.118092));
    expected.add(
        new User(
            2, "James", "Smith", "James.smith@test.com", "192.57.50.111", 34.001135, -117.722861));
    expected.add(
        new User(3, "will", "Smith", "will.smith@test.com", "192.57.50.11", 51.509865, -0.118092));
    when(dwpClient.retrieveAllUsers()).thenReturn(expected);
    List<User> result = userServiceImpl.getAllUsers();
    System.out.println(result);
    Assertions.assertEquals(expected, result);
  }
}
