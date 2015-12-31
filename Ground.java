import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

public class Ground extends World
{
    Start start=new Start();
    int ile;
    Rysunek rysunek=new Rysunek();
    
    public Ground()
    {    
        super(600,400,1);
        addObject (start, 300,200);
    }

    public void act()
    {
         start();
    }
           
        
    public void ileBokow() 
    {
        do
        { String boki = JOptionPane.showInputDialog("Ile boków ma mieć wielokąt? (Podaj n)");
          ile = Integer.parseInt(boki);
        }while(ile<3);
        addObject (rysunek, 300,200);
        rysunek.wielokat(ile);
    }    

    public void start()
     {
        if(Greenfoot.mousePressed(start))
        {
              removeObject(start);
              Greenfoot.delay(50);
              ileBokow();
        }
    }
}