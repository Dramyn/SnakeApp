import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


import static main.Rectangle.rec_height;
import static main.Rectangle.rec_width;

public class Snake {


    private ArrayList<Rectangle> body;

    private String movement;

    private Food food;

    

}

public void setMovement(String movement){
    this.movement = movement;
}