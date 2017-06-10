package io.sankha.powermocktest;

/**
 * Created by User on 04-06-2017.
 */
public interface UserService {
    public User getUserById(final Long userId);

    public void updateUserDetails(final User newUserDetails);

    public void createUser(final User user);

    public Long getUserCount();
}
