package io.sankha.powermocktest;

import lombok.AllArgsConstructor;

/**
 * Created by User on 04-06-2017.
 */
@AllArgsConstructor
public class FinalClazzUser {
    private SimpleFinalClazz simpleFinalClazz;

    public String getMeSomething() {
        return "Get Me Something " + this.simpleFinalClazz.simpleFinalMethod();
    }
}
