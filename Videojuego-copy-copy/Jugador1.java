import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador1 extends Actor
{
    /**
     * Act - do whatever the Jugador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean disparo=true;
    private int rotacion=0;
    public Jugador1(){
        getImage().scale(50,50);
    }
    public void act(){
        moveAround();  
        fireProjectile();
    }
    public void fireProjectile(){
        if (Greenfoot.isKeyDown("space") && disparo==true){
            getWorld().addObject(new Proyectil(),getX() +5,getY());
            disparo=false;
        } else if (!Greenfoot.isKeyDown("Space") && disparo==false){
            disparo=true;
        }
    }
    public void moveAround()
    {
        getImage().scale(50,50);
        if (Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            setLocation(getX(),getY()-5);
            rotacion=1;
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            setLocation(getX()-5,getY());
            rotacion=2;
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            setLocation(getX()+5,getY());
            rotacion=3;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            setLocation(getX(),getY()+5);
            rotacion=4;
        }
        
        
    }
    public int getRotacion(){
            return rotacion;
            
        }
}
