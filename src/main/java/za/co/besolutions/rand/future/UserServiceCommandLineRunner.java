package za.co.besolutions.rand.future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import za.co.besolutions.rand.future.entity.User;
import za.co.besolutions.rand.future.service.UserService;

@Component
public class UserServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceCommandLineRunner.class);
    @Autowired
    private UserService userService;


    @Override
    public void run(String... args) throws Exception {
        User user = new User("Elias", "CEO & Co-Founder");
        User user1 = new User("Boikanyo", "PM & Co-Founder");
        User user2 = new User("Lesetja", "MD");

        logger.info("Inserted user {}", userService.insert(user));
        logger.info("Inserted user {}",userService.insert(user1));
        logger.info("Inserted user {}",userService.insert(user2));

    }
}
