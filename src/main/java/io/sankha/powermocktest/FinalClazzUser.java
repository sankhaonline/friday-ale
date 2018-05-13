package io.sankha.powermocktest;

/**
 * Created by User on 04-06-2017.
 */
//@AllArgsConstructor
public class FinalClazzUser {
    public FinalClazzUser(SimpleFinalClazz simpleFinalClazz) {
        this.simpleFinalClazz = simpleFinalClazz;
    }

    public SimpleFinalClazz getSimpleFinalClazz() {
        return simpleFinalClazz;
    }

    public void setSimpleFinalClazz(SimpleFinalClazz simpleFinalClazz) {
        this.simpleFinalClazz = simpleFinalClazz;
    }

    private SimpleFinalClazz simpleFinalClazz;

    public String getMeSomething() {
        return "Get Me Something " + this.simpleFinalClazz.simpleFinalMethod();
    }
}
