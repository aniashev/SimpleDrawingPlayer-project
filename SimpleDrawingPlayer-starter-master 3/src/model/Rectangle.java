package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape{

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        instrument = 16;
        PLAYING_COLOR = new Color(51, 153, 255);
    }

    public Rectangle (int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void drawGraphics(Graphics g) {
          g.drawRect(x, y, width, height);}


    @Override
    public void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }
}
