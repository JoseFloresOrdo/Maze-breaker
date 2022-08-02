import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NubeHorizontal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NubeHorizontal extends Actor
{
    /**
     * Act - do whatever the NubeHorizontal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean tocarbar=false;
    public NubeHorizontal(){
        getImage().scale(100,50);
    }
    public void act()
    {
        getImage().scale(100,50);
        barrera();
        barrera2();
    }
    public void barrera(){
        Actor pro= getOneIntersectingObject(Proyectil.class);
        Actor car= getOneIntersectingObject(Jugador1.class);
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
