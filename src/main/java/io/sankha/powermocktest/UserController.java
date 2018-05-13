package io.sankha.powermocktest;

import java.util.UUID;

/**
 * Created by User on 04-06-2017.
 */
//@AllArgsConstructor
//@NoArgsConstructor
public class UserController {
    public UserController() {
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    public Long getUserCount() {
        return this.userService.getUserCount();
    }

    public String createUserId(final User user) {
        return String.format("%s_%s", user.getSurname(), UUID.randomUUID().toString());
    }

    public String getGreetingText(User user) {
        return String.format(getGreetingFormat(), user.getFirstName(), user.getSurname());
    }

    private String getGreetingFormat() {
        return "Hello %s %s";
    }
}
