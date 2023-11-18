package ai;

import game.PowerUp;
import game.Tank;
import game.TankAIBase;
import game.Vec2;
import java.lang.Math;

import org.omg.CORBA.PolicyError;


public class OtherAI extends TankAIBase {
    public String getPlayerName() {
        return "Taha";  // <---- Put your first name here
    }
    public int getPlayerPeriod() {
        return -1;
    }
 
    public boolean updateAI() {
 
        // TODO: Your code goes here
        PowerUp powerUp= this.getPowerUp();
        Vec2 powerUpPosVec2= powerUp.getPos();
        Vec2 tankPosVexVec2=getTankPos();      
        Vec2 path=Vec2.subtract(powerUpPosVec2,tankPosVexVec2 );
       
           
            queueCmd("move", new Vec2(path.x,0));
            queueCmd("move", new Vec2(0,path.y));
       
         
        return true;
    }
    
}