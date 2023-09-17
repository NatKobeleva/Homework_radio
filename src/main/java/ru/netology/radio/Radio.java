package ru.netology.radio;

public class Radio {
    private int numberOfStation = 10;
    private int minStation;
    private int maxStation = numberOfStation - 1;
    private int currentStation;
    private int currentVolume;


    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
        this.minStation = minStation;
        this.maxStation = numberOfStation - 1;
    }

    public Radio() {
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation += 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation -= 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        } else {
            currentVolume = 0;
        }
    }
}
