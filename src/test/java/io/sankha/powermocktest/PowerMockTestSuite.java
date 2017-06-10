package io.sankha.powermocktest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Sankha S Ghosh on 10-06-2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmployeeControllerTest.class,
        SimpleFinalClazzTest.class,
        UserControllerTest.class
})
public class PowerMockTestSuite {
}
