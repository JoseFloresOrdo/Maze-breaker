import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NubeVertical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NubeVertical extends Actor
{
    /**
     * Act - do whatever the NubeVertical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NubeVertical(){
        getImage().scale(50,100);
    }
    public void act()
    {
        getImage().scale(50,100);
        barrera();
        barrera2();
    }
    public void barrera(){
        Actor pro= getOneIntersectingObject(Proyectil.class);
        Actor car = getOneIntersectingObject(Jugador1.class);
        if(pro!=null){
            getWorld().removeObject(pro);
        
        }

    }  
    public void barrera2(){
        Actor pro= getOneIntersectingObject(Proyectil2.class);
        Actor car = getOneIntersectingObject(Jugador1.class);
        if(pro!=null){
            getWorld().removeObject(pro);
        
        }

    }   
}
