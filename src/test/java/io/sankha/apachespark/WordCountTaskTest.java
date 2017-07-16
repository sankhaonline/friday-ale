package io.sankha.sparkexample;

import org.junit.Test;

import java.net.URISyntaxException;

/**
 * Created by User on 16-07-2017.
 */
public class WordCountTaskTest {
    @Test
    public void test() throws URISyntaxException {
        String inputFile = getClass().getResource("/loremipsum.txt").toURI().toString();
        new WordCountTask().run(inputFile);
    }
}
