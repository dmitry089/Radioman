package ru.netology.radio;

public class Radio {
    public int currentNumber;
    public int soundVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void next() {
        if (currentNumber == 9) {
            currentNumber = 0;
        } else {
            currentNumber = currentNumber + 1;
        }
    }

    public void prev() {
        if (currentNumber == 0) {
            currentNumber = 9;
        } else {
            currentNumber = currentNumber - 1;
        }
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > 9) {
            return;
        }
        if (newCurrentNumber < 0) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
    }

    public void volumeUp() {
        if (soundVolume == 10) {
            soundVolume = 10;
        } else {

            soundVolume = soundVolume + 1;
        }
    }

    public void volumeDown() {
        if (soundVolume == 0) {
            soundVolume = 0;
        } else {
            soundVolume = soundVolume - 1;
        }
    }
}
