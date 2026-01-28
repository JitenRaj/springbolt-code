package structural.adapter;

// Adaptee Interface: A separate, incompatible interface
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}