import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectil extends Actor
{
    /**
     * Act - do whatever the Proyectil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gif1= new GifImage("Proyectil.gif");
    
    public Proyectil(){
        setImage(gif1.getCurrentImage());
        getImage().scale(40,14);
    }
    public void act()
    {
        getImage().scale(40,14);
        setImage(gif1.getCurrentImage());
        ProjectileMove();
        rotationProjectile();
        removeEnemy();
        removeFromWorld();
    }
    public void ProjectileMove(){
        setLocation(getX(),getY());
    }
    public void removeFromWorld(){
        if (getX()==699){
            getWorld().removeObject(this);
        }
        else if (getX()==0){
            getWorld().removeObject(this);
        }
        else if (getY()==0){
            getWorld().removeObject(this);
        }
        else if (getY()==699){
            getWorld().removeObject(this);
        }

    }
    public void rotationProjectile(){
        Jugador1 jugador1= getWorld().getObjects(Jugador1.class).get(0);
        if (jugador1.getRotacion()==1){
            setRotation(270);
            setLocation(getX(),getY() -20);
        }
        else if (jugador1.getRotacion()==2){
            setRotation(180);
            setLocation(getX() -20,getY());
        }
        else if (jugador1.getRotacion()==3){
            setRotation(0);
            setLocation(getX() +20,getY());
        }
        else if (jugador1.getRotacion()==4){
            setRotation(90);
            setLocation(getX(),getY()+20);
        }
        
    }
    public void rotationProjectile2(){
        Jugador2 jugador2= getWorld().getObjects(Jugador2.class).get(0);
        if (jugador2.getRotacion()==5){
            setRotation(270);
            setLocation(getX(),getY() -20);
        }
        else if (jugador2.getRotacion()==6){
            setRotation(180);
            setLocation(getX() -20,getY());
        }
        else if (jugador2.getRotacion()==7){
            setRotation(0);
            setLocation(getX() +20,getY());
        }
        else if (jugador2.getRotacion()==8){
            setRotation(90);
            setLocation(getX(),getY()+20);
        }
    }
    public void removeEnemy()
    {
        Actor enemy = getOneIntersectingObject(Jugador2.class);
        if (enemy != null)
        {
            getWorld().removeObject(enemy);
            MyWorld.score1++;
            getWorld().addObject(new Jugador2(),getX(),getY());
        }
    }
}
