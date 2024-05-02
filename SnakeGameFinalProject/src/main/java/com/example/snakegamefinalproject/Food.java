package com.example.snakegamefinalproject;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.Random;


public class Food {
    private final Position position;
    private final Rectangle rectangle;
    private final Random random = new Random();
    private final int size;


    public Food(double xPos, double yPos, AnchorPane pane, double size) {
        this.size = (int) size;
        position = new Position(xPos,yPos);
        rectangle = new Rectangle(position.getXPos(),position.getYPos(),size,size);
        Color color = Color.BLUE;
        rectangle.setFill(color);
        pane.getChildren().add(rectangle);
    }

    public Position getPosition() {
        return position;
    }

    public void moveFood(){
        getRandomSpotForFood();
    }

    //Moves the food to a random position on the screen,
    public void getRandomSpotForFood(){
        int positionX = random.nextInt(12);
        int positionY = random.nextInt(12);
        rectangle.setX(positionX * size);
        rectangle.setY(positionY * size);

        position.setXPos(positionX * size);
        position.setYPos(positionY * size);
        System.out.println((positionX * size) + "---FOOD---" +(positionY * size));
    }
}