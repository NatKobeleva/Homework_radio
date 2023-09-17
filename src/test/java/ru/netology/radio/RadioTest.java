package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(15);

    @Test
    public void shouldNumberOfStation() {

        Assertions.assertEquals(15, radio.getNumberOfStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(14, radio.getMaxStation());
    }

    @Test
    public void shouldNumberOfStationDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumberOfStation());
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(3);

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(30);

        int expected = 30;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxStation() {
        radio.setCurrentStation(17);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underMinStation() {
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxVolume() {
        radio.setCurrentVolume(105);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underMinVolume() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        radio.setCurrentStation(14);

        int expected = 14;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStationToMax() {
        radio.setCurrentStation(6);

        radio.nextStation();
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationToMaxUpperLimit() {
        radio.setCurrentStation(13);

        radio.nextStation();
        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationIfMax() {
        radio.setCurrentStation(14);

        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationToMinUpperToLimit() {
        radio.setCurrentStation(1);

        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationToMin() {
        radio.setCurrentStation(9);

        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationIfMin() {
        radio.setCurrentStation(0);

        radio.prevStation();
        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(34);

        radio.increaseVolume();
        int expected = 35;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToMaxUpperLimit() {
        radio.setCurrentVolume(99);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIf100() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(34);

        radio.decreaseVolume();
        int expected = 33;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeToMinUpperLimit() {
        radio.setCurrentVolume(1);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfZero() {
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}