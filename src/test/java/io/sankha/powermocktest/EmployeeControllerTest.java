package io.sankha.powermocktest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

/**
 * Created by User on 04-06-2017.
 */
public class EmployeeControllerTest {
    @Test
    public void verifyMethodInvokationTest() {
        final EmployeeService mock = PowerMockito.mock(EmployeeService.class);
        final EmployeeController employeeController = new EmployeeController(mock);

        final Employee employee = new Employee();
        employeeController.saveEmployee(employee);

        //Verifying that controller did call the
        //saveEmployee() method on the mocked service instance.
        Mockito.verify(mock).saveEmployee(employee);
    }

    @Test
    public void firstMockTest() {
        //Creating a mock using the PowerMockito.mock
        //method for the EmployeeService class.
        final EmployeeService mock = PowerMockito.mock(EmployeeService.class);

        //Next statement essentially says that when getProjectedEmployeeCount method
        //is called on the mocked EmployeeService instance, return 8.
        PowerMockito.when(mock.getEmployeeCount()).thenReturn(8);

        final EmployeeController employeeController = new EmployeeController(mock);

        Assert.assertEquals(16, employeeController.getProjectedEmployeeCount());
    }
}