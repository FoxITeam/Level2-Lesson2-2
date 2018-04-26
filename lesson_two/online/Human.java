package lesson_two.online;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Human implements InterfaceC, InterfaceB {

    @Override
    public void think() {

    }

    @Override
    public void beSmart() {

    }

    private static final class Example extends JPanel{
        Example() {
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
        }
    }

    @Override
    public void speak() throws ArithmeticException {

    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void waveHands() {

    }

    @Override
    public void jump() {

    }
}
