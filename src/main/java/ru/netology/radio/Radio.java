package ru.netology.radio;
public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setToMaxVolume(){
        currentVolume = 100;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9){
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation += 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }
    public void prevStation() {
        if (currentStation > 0) {
            currentStation -= 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
        if (currentVolume == 100){
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
        if (currentVolume == 0){
            currentVolume = 0;
        }
    }
}
