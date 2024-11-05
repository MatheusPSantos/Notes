package com.br.padroesdeprojetos.templatemethod;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
  String message;

  public void init() {
    message = "hello ";
    repaint();
  }

  public void start() {
    message = "now i am starting up ...";
    repaint();
  }

  public void stop() {
    message = "oh no i am being stopped...";
    repaint();
  }

  public void destroy() {

  }

  public void paint(Graphics g) {
    g.drawString(message, 5, 15);
  }

}
