package io.sankha.powermocktest;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.*;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

/**
 * Created by User on 04-06-2017.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(UserController.class)
public class UserControllerTest {
    private DefaultUserService mockUserService;
    private UserController userController;

    @Test
    public void testGetUserCount() {
        this.mockUserService = mock(DefaultUserService.class);
        PowerMockito.when(this.mockUserService.getUserCount()).thenReturn(100L);
        this.userController = new UserController(this.mockUserService);
        assertEquals(100L, this.userController.getUserCount().longValue());
    }

    @Test
    public void testMockStatic() throws Exception {
        PowerMock.mockStaticPartial(UUID.class, "randomUUID");
        EasyMock.expect(UUID.randomUUID()).andReturn(UUID.fromString("067e6162-3b6f-4ae2-a171-2470b63dff00"));
        PowerMock.replayAll();
        final UserController userController = new UserController();
        Assert.assertTrue(userController.createUserId(getNewUser()).contains("067e6162-3b6f-4ae2-a171-2470b63dff00"));
        PowerMock.verifyAll();
    }

    @Test
    public void testMockPrivateMethod() throws Exception {
        UserController spy = spy(new UserController());
        when(spy, method(UserController.class, "getGreetingFormat")).withNoArguments().thenReturn("Good Morning %s %s");
        User user = new User();
        user.setFirstName("Sankha");
        user.setSurname("Ghosh");
        assertEquals("Good Morning Sankha Ghosh", spy.getGreetingText(user));
    }

    private User getNewUser() {
        final User user = new User();
        user.setFirstName("Sankha");
        user.setSurname("Ghosh");
        return user;
    }
}