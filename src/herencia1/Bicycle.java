package herencia1;

import java.util.Objects;

public class Bicycle {
    
    // the Bicycle class has three fields
    public int cadence; // PROTECTED Las que esten en el paquete + las subclases
    public int gear; // Si no se pone nada, todas las clases en el mismo paquete pueden usarlo
    public int speed; // PRIVADO, solo la clase
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
            + " with a cadence of " + this.cadence +
            " and travelling at a speed of " + this.speed + ". ");
    }

	@Override
	public int hashCode() {
		return Objects.hash(cadence, gear, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicycle other = (Bicycle) obj;
		return cadence == other.cadence && gear == other.gear && speed == other.speed;
	}
    
    
    
}
