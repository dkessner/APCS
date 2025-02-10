//
// Pixels.java
//


import processing.core.*;


public class Pixels extends PApplet
{
    private PImage gadget;
    private PImage tux;

    private String cat = "Gadget";

    private boolean red = false;
    private boolean green = false;
    private boolean blue = false;
    private boolean mirror = false;
    private boolean grey = false;


    public void settings()
    {
        size(800, 600);
    }

    public void setup()
    {
        initializeImages();
    }

    private void initializeImages()
    {
        gadget = loadImage("gadget.jpg");
        gadget.resize(width, height);

        tux = loadImage("tux.jpg");
        tux.resize(width, height);
    }


    private void clearFilters()
    {
        red = false;
        green = false;
        blue = false;
        mirror = false;
        grey = false;
    }


    public void draw()
    {
        background(0);

        PImage current = cat.equals("Gadget") ? gadget : tux;
        applyFilters(current);
        imageMode(CENTER);
        image(current, width/2, height/2);

        fill(100);
        noStroke();
        rect(0, 0, 200, 300);
        fill(255);
        int x = 25;
        int y = 25;
        textSize(15);
        text("<space>: change image", x, y+=25);
        text("r: red", x, y+=25);
        text("g: green", x, y+=25);
        text("b: blue", x, y+=25);
        text("m: mirror", x, y+=25);
        text("y: grey", x, y+=25);
        text("<enter>: clear", x, y+=25);
    }


    private int index(int i, int j)
    {
        return i*width + j;    
    }


    private void applyRedFilter(int[] pixels)
    {
        for (int i=0; i<pixels.length; i++)
            pixels[i] &= 0xffff0000;
    }


    private void applyGreenFilter(int[] pixels)
    {
        for (int i=0; i<pixels.length; i++)
            pixels[i] &= 0xff00ff00;
    }


    private void applyBlueFilter(int[] pixels)
    {
        for (int i=0; i<pixels.length; i++)
            pixels[i] &= 0xff0000ff;
    }


    private void applyMirrorFilter(int[] pixels)
    {
        for (int i=0; i<height; i++)
        for (int j=0; j<width/2; j++)
            pixels[index(i,width-j-1)] = pixels[index(i,j)]; 
    }


    private void applyGreyFilter(int[] pixels)
    {
        for (int i=0; i<pixels.length; i++)
        {
            int r = (pixels[i] & 0x00ff0000)>>16;
            int g = (pixels[i] & 0x0000ff00)>>8;
            int b = pixels[i] & 0x000000ff;
            int grey = (r + g + b)/3;
            pixels[i] = 0xff000000 | grey<<16 | grey<<8 | grey;
        }
    }


    private void applyFilters(PImage img)
    {
        img.loadPixels();

        if (red) applyRedFilter(img.pixels);
        if (green) applyGreenFilter(img.pixels);
        if (blue) applyBlueFilter(img.pixels);
        if (mirror) applyMirrorFilter(img.pixels);
        if (grey) applyGreyFilter(img.pixels);

        img.updatePixels();
    }


    public void keyPressed()
    {

        if (key == ' ')
            cat = cat.equals("Gadget") ? "Tux" : "Gadget";

        else if (key == 'r') red = !red;
        else if (key == 'g') green = !green;
        else if (key == 'b') blue = !blue;
        else if (key == 'm') mirror = !mirror;
        else if (key == 'y') grey = !grey;
        else if (keyCode == ENTER) clearFilters();

        initializeImages();
    }

    public static void main(String[] args)
    {
        PApplet.main("Pixels");
    }

} // PApplet
