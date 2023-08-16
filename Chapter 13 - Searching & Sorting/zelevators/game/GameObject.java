package game;

import java.awt.Graphics2D;

public class GameObject {
	// Member variables...
    protected Vec2 pos = null;
	protected double timeTillDeath = 0;
    protected double timeSinceBorn = 0;

    // Accessors...
    public Vec2 getPos() {
        return Vec2.copy(this.pos);
    }

	// Member functions (methods)...
    protected GameObject() {
    }

    protected void destroy() {
    }

    protected boolean shouldBeCulled() {
        return (timeTillDeath >= 1);
    }

	public boolean isDying() {
		return (this.timeTillDeath > 0);
	}    

    protected void update(double deltaTime) {
        // Timers...
        timeSinceBorn += deltaTime;

        // If we are off the field, kill ourselves off...
        if (!Util.isInsideField(pos)) {
            timeTillDeath = Math.max(timeTillDeath, 0.0001);
        }
        if (timeTillDeath > 0.0) {
            timeTillDeath = Math.min(timeTillDeath + deltaTime * 2, 1.0);
        }
    }

    protected double calcDrawScale() {
		return Math.max(1.0 - this.timeTillDeath, 0.001);
	}

    protected void drawShadow(Graphics2D g) {
    }

    protected void draw(Graphics2D g) {
    }
}
