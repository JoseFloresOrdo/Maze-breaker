import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador2 extends Actor
{
    private boolean disparo=true;
    private int rotacion=0;
    /**
     * Act - do whatever the Jugador2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jugador2(){
        setRotation(180);
        getImage().scale(50,50);
    }
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    public void fireProjectile()
    {
        if (Greenfoot.isKeyDown("p") && disparo==true){
            getWorld().addObject(new Proyectil(),getX() +5,getY());
            disparo=false;
        } else if (!Greenfoot.isKeyDown("p") && disparo==false){
            disparo=true;
        }
    }
    public void moveAround()
    {
        getImage().scale(50,50);
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            setLocation(getX(),getY()-5);
            rotacion=1;
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            setLocation(getX()-5,getY());
            rotacion=2;
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            setLocation(getX()+5,getY());
            rotacion=3;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            setLocation(getX(),getY()+5);
            rotacion=4;
        }
    }
    public void removeEnemy(){
        if (getY()==0){
            getWorld().removeObject(this);
        }    
    }
}
