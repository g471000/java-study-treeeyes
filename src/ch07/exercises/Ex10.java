package ch07.exercises;

public class Ex10 {
    public static void main(String[] args) {
        MyTV10 tv = new MyTV10();

        tv.setChannel(10);
        System.out.println("CH: " + tv.getChannel());
        tv.setVolume(20);
        System.out.println("VOL: " + tv.getVolume());
    }
}

class MyTV10 {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL= 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
            return;
        }
        this.channel = channel;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            return;
        }
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}
