package ai;

import game.PowerUp;
import game.Tank;
import game.TankAIBase;
import game.Vec2;
import java.lang.Math;

import org.omg.CORBA.PolicyError;

public class TankAI extends TankAIBase {

    public String getPlayerName() {
        return "<Mihir>"; 
    }
    public int getPlayerPeriod() {
        return 1;
    }

    // public final PowerUp POWER_UP_1 = this.getPowerUps()[1];
    // public final PowerUp POWER_UP_2 = this.getPowerUps()[2];

    public void getClosestPowerupToTank(PowerUp firstPowerUp, PowerUp secondPowerUp, Tank tank) {
            
        double PowerUp1PositionX = firstPowerUp.getPos().x;
        double PowerUp1PositionY = firstPowerUp.getPos().y; 
        double PowerUp2PositionX = secondPowerUp.getPos().x;
        double PowerUp2PositionY = secondPowerUp.getPos().y;

        double calculatedXPos = Math.abs(PowerUp1PositionX - PowerUp2PositionX);
        double calculatedYPos = Math.abs(PowerUp1PositionY - PowerUp2PositionY); 

        if (calculatedXPos < firstPowerUp.getPos().x && calculatedYPos < firstPowerUp.getPos().y) {
            queueCmd("move", new Vec2 (firstPowerUp.getPos().x - tank.getPos().x, 0)); 
            queueCmd("move", new Vec2 (0, firstPowerUp.getPos().y - tank.getPos().y)); 

        } else if (calculatedXPos < secondPowerUp.getPos().x && calculatedYPos < secondPowerUp.getPos().y) {
            queueCmd("move", new Vec2 (secondPowerUp.getPos().x - tank.getPos().x, 0)); 
            queueCmd("move", new Vec2 (0, secondPowerUp.getPos().y - tank.getPos().y)); 
        }
    }   

    private PowerUp getClosestPowerUp() {
        PowerUp minimumDistance = null; 
        for (PowerUp powerUp : getPowerUps()) {
            if (minimumDistance == null || Vec2.distance(getTankPos(), minimumDistance.getPos()) 
            > Vec2.distance(getTankPos(), powerUp.getPos())) {
                minimumDistance = powerUp; 
            }
        }
        return minimumDistance; 
    }

    private void MoveTank(Vec2 vec2) {
        if (vec2.x != getTankPos().x) {
            queueCmd("move", new Vec2(vec2.x - getTankPos().x, 0));
        }
        if (vec2.x != getTankPos().y) {
            queueCmd("move", new Vec2(0, vec2.y - getTankPos().y));
        }
    }

    private void MoveAwayFromTank() {

    }

    public void FallbackFunction(PowerUp POWERUP) {
        queueCmd("move", new Vec2(POWERUP.getPos().x - tank.getPos().x, 0));
        queueCmd("move", new Vec2(0, POWERUP.getPos().y - tank.getPos().y));
    }
        
    public boolean updateAI() {
        PowerUp powerUp = getClosestPowerUp(); 
        MoveTank(powerUp.getPos());
        return true;

    }
}