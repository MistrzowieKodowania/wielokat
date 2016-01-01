import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

public class Ground extends World
{
    Start start=new Start();
    Rysunek rysunek=new Rysunek();
    
    public Ground()
    {    
        super(600,400,1);
        addObject (start, 300,200);
    }

    public void act()
    {
         
        if(Greenfoot.mouseClicked(start))
        {
             removeObject(start);
             Greenfoot.delay(50);
             ileBokow(); 
        }
    }
           
        
    public void ileBokow() 
    {
        int ile;
        do
             { try {String boki = JOptionPane.showInputDialog("Ile boków ma mieć wielokąt? (Nie mniej niż 3)");
              ile = Integer.parseInt(boki);
               } catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Miałeś podać liczbę całkowitą");
                   ile=0;
                }
             }while(ile<3);
        addObject (rysunek, 300,200);
        rysunek.wielokat(ile);
    }    
}