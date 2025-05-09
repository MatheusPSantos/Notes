package com.br.padroesdeprojetos.templatemethod;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
  
  public MyFrame(String title) {
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  public void paint(Graphics graphics) {
    super.paint(graphics);
    String msg = "I rule!";
    //graphics.drawString(msg, 100, 100);

    graphics.notify();
    graphics.setPaintMode();
    graphics.drawArc(200, 200, 200, 200, 200, 200);
  }

  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame("Heard First - Design Patterns");
  }

}
