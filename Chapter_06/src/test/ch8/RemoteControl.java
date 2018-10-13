package test.ch8;

public interface RemoteControl {

    // 상수;
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드;
    void turnOn();
    void tunnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            return;
        }
    }

    static void changeBattery() {

    }

}
