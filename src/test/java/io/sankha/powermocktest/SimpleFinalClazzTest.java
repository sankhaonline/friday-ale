package io.sankha.powermocktest;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by User on 04-06-2017.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(SimpleFinalClazz.class)
public class SimpleFinalClazzTest {
    @Test
    public void testMockFinal() {
        SimpleFinalClazz simpleFinalClazz = PowerMock.createMock(SimpleFinalClazz.class);
        FinalClazzUser finalClazzUser = new FinalClazzUser(simpleFinalClazz);
        EasyMock.expect(simpleFinalClazz.simpleFinalMethod()).andReturn("Hurray!!!");
        PowerMock.replay(simpleFinalClazz);
        String actual = finalClazzUser.getMeSomething();
        PowerMock.verify(simpleFinalClazz);
        Assert.assertEquals(actual, "Get Me Something Hurray!!!");
    }

    @Test
    public void testMockSimpleFinal() {
        SimpleFinalClazz simpleFinalClazz = new SimpleFinalClazz();
        String actualSimpleFinalClazz = simpleFinalClazz.simpleFinalMethod();
        Assert.assertEquals(actualSimpleFinalClazz, "Final String");

    }
}