package com.hungry.HungryProject;

import static org.assertj.core.api.Assertions.assertThat;
 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepoTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepo repo;
     
    @Test
    public void UserCreateTest(){
        User user = new User();
        user.setEmail("123@gmail.com");
        user.setFirstName("BARATHKUMAR");
        user.setLastName("M");
        user.setPassword("myPassword");

        User saveduser = repo.save(user);

        User existUser = entityManager.find(User.class, saveduser.getId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    } 
}