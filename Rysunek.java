import greenfoot.*;
import java.awt.Color;
import java.lang.Math;
public class Rysunek extends Actor
{
    GreenfootImage rys;
    boolean widoczny=false;
    int[] xWiel;
    int[] yWiel;
    int bok;
    public void wielokat(int bok)
    {
        xWiel = new int[bok];
        yWiel = new int[bok];
        for (int i=0; i<bok; i++)
        {
            double kat= Math.toRadians(i*360/bok);
            xWiel[i]= (int)(300 + 150*Math.cos(kat));
            yWiel[i]= (int)(200 + 150*Math.sin(kat));                                   
        }
        
        setImage(new GreenfootImage(600,400));
        rys = getImage();
        rys.setColor(Color.RED);
        rys.drawPolygon(xWiel, yWiel, bok); 
        widoczny=true;
    }
    public void act(){
        if(Greenfoot.mousePressed(this)) Greenfoot.stop();
        if(widoczny){
             Color nowy = new Color(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256));
             rys.setColor(nowy);
             Greenfoot.delay(50);
             rys.fillPolygon(xWiel, yWiel, xWiel.length);
             }
        }
    }