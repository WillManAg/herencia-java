package herencia1;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
               int startCadence,
               int startSpeed,
               int startGear,
               String suspensionType){
        super(startCadence,
              startSpeed,
              startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
      return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a" +
            getSuspension() + " suspension.");
    }
    
    // Copiamos y modificamos levemente un metodo del padre, hay que poner override
    @Override
    public void applyBrake(int decrement) {
        speed -= (decrement+2);
    }
    
    public void prueba() {
    	this.setGear(9);
    }
}