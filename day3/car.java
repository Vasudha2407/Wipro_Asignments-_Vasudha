package day3;

public class car {
	   private int speed;
	    private double fuelLevel;

	    public Car(double fuelLevel) {
	        this.fuelLevel = fuelLevel;
	        this.engineOn = false;
	        this.speed = 0;
	    }

	    public void startEngine() {
	        if (fuelLevel > 0) {
	            engineOn = true;
	            System.out.println("Engine started");
	        } else {
	            System.out.println("No fuel");
	        }
	    }

	    public void accelerate() {
	        if (engineOn) {
	            speed += 10;
	            fuelLevel -= 0.5;
	        }
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    public double getFuelLevel() {
	        return fuelLevel;
	    }
	}

}
