package ua.dp.levelup.classwork.lesson15

import spock.lang.Specification

import static junit.framework.Assert.assertEquals

/**
 * Created by java on 23.12.2016.
 */
class CoinTest extends Specification {

    def "GetDiameter"() {
        when:
        Coin coin = new Coin(10, 12);
        int expected = 12;
        int actual = coin.getDiameter();a
        then:
        assertEquals(actual, expected)
    }
    def "SetIncorrectDiameter"() {
        when:
        Coin coin = new Coin(-5, -5); ;
        then:
        thrown CoinLogicException;
    }
}
