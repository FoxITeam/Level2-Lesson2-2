package lesson_one.the_game;

import lesson_one.common.CanvasListener;
import lesson_one.common.GameCanvas;
import lesson_one.common.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow extends JFrame implements CanvasListener{

    private static final int POS_X = 600;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }

    private MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(POS_X, POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        setTitle("Circles");
        GameCanvas gameCanvas = new GameCanvas(this);
        gameCanvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    addGameObject(new Ball(e.getX(), e.getY()));
                } else if (e.getButton() == MouseEvent.BUTTON3) {
                    removeGameObject();
                }
            }
        });
        add(gameCanvas);
        initGame();
        setVisible(true);
    }

    private GameObject[] gameObjects = new GameObject[1];
    private int gameObjectsCount;

    private void addGameObject(GameObject sprite) {
        if (gameObjectsCount == gameObjects.length) {
            GameObject[] newGameObjects = new GameObject[gameObjects.length * 2];
            System.arraycopy(gameObjects, 0, newGameObjects, 0, gameObjects.length);
            gameObjects = newGameObjects;
        }
        gameObjects[gameObjectsCount] = sprite;
        gameObjectsCount++;
    }

    private void removeGameObject() {
        if (gameObjectsCount > 1) {
            gameObjectsCount--;
        }
    }

    private void initGame() {
        addGameObject(new Background());
        addGameObject(new Ball());
    }

    public void onDrawFrame(GameCanvas gameCanvas, Graphics g, float deltaTime) {
        update(gameCanvas, deltaTime);
        render(gameCanvas, g);
    }

    private void render(GameCanvas gameCanvas, Graphics g) {
        for (int i = 0; i < gameObjectsCount; i++) {
            gameObjects[i].render(gameCanvas, g);
        }
    }

    private void update(GameCanvas gameCanvas, float deltaTime) {
        for (int i = 0; i < gameObjectsCount; i++) {
            gameObjects[i].update(gameCanvas, deltaTime);
        }
    }

}
