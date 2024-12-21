package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HamburguesaTest.class,
        DecoradorHamburguesaTest.class,
        LechugaTest.class,
        QuesoTest.class,
        TomateTest.class
})
public class HamburguesaSuiteTest {
}