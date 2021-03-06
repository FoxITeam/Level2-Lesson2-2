package lesson_one.common;

import java.awt.*;

public class Sprite implements GameObject{
    protected float x;    // x of the center of sprite
    protected float y;    // y center
    protected float halfHeight;
    protected float halfWidth;

    protected float getLeft(){ return x - halfWidth; }
    protected void setLeft(float left){ x = left + halfWidth; }
    protected float getRight(){ return x + halfWidth; }
    protected void setRight(float right){ x = right - halfWidth;}
    protected float getTop(){ return y - halfHeight; }
    protected void setTop(float top){ y = top + halfHeight; }
    protected float getBottom(){ return y + halfHeight; }
    protected void setBottom(float bottom){ y = bottom - halfHeight; }

    protected float getWidth(){ return 2f * halfWidth; }
    protected float getHeight(){ return 2f * halfHeight; }

    @Override
    public void render(GameCanvas gameCanvas, Graphics g) {/*do nothing*/}

    @Override
    public void update(GameCanvas gameCanvas, float deltaTime) {}

}
