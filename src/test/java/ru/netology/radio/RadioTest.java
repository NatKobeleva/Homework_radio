package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.currentStation = 3;

        int expected = 3;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 30;

        int expected = 30;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationToMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.nextStation();
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextStationIfMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevStationToMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevStationIfMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();
        radio.currentVolume = 34;

        radio.increaseVolume();
        int expected = 35;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeIf100(){
        Radio radio = new Radio();
        radio.currentVolume = 100;

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio radio = new Radio();
        radio.currentVolume = 34;

        radio.decreaseVolume();
        int expected = 33;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldDecreaseVolumeIfZero(){
        Radio radio = new Radio();
        radio.currentVolume = 0;

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }
}


