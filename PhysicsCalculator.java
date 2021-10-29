package xyz.nisarga.PhysicsCalculator;

// Author- Nisarga Adhikary (adhikarynisarga17@gmail.com)
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.*;

@DesignerComponent(version = 1, // Extension Version
                   description = "PhysicsCalculator extension for MIT AI2 & it's distros by <b> Nisarga Adhikary </b>.So Give Credit if you using this Repo ",
                   category = ComponentCategory.EXTENSION,
                   nonVisible = true,
                   iconName = "images/extension.png")
@SimpleObject(external = true)
public class PhysicsCalculator extends AndroidNonvisibleComponent {

    public PhysicsCalculator(ComponentContainer container) {
        super(container.$form());
    }

   @SimpleFunction(description = "Calculate Density")
    public int CalculateDensity (int mass, int volume) { 
    return mass * 1/volume; 

    }
  @SimpleFunction(description = "Calculate Volume")
    public int CalculateVolume (int mass, int density) { 
    return mass * 1/density; 

    }
  @SimpleFunction(description = "Calculate Mass")
    public int CalculateMass (int density, int volume) { 
    return density * volume; 

    }
  @SimpleFunction(description = "Calculate Speed")
    public int CalculateSpeed (int distance, int time) { 
    return distance * 1/time; 

    }
  @SimpleFunction(description = "Calculate Distance")
    public int CalculateDistance (int time, int speed) { 
    return time * speed; 

    }
  @SimpleFunction(description = "Calculate Acceleration")
    public int CalculateAcceleration (int InitialVelocity, int FinalVelocity, int Time) { 
    return (FinalVelocity - InitialVelocity) * 1/Time;
  
    }
  @SimpleFunction(description = "CalculateRetardation")
    public int CalculateRetardation (int InitialVelocity, int FinalVelocity, int Time) { 
    return (InitialVelocity - FinalVelocity) * 1/Time;
  
    }
  @SimpleFunction(description = "CalculateForce")
    public int CalculateForce (int mass, int acceleration) { 
    return mass * acceleration;
  
    }
  @SimpleFunction(description = "CalculatePressure")
    public int CalculatePressure (int force, int area) { 
    return force * 1/area;
  
    }
  @SimpleFunction(description = " Calculate Heat Absorbed By An Object ")
    public int CalculateHeatAbsorbed (int MassOfObject, int RelativeHeat, int ChangeOfTemperature) { 
    return MassOfObject * RelativeHeat * ChangeOfTemperature;
  
    }
  @SimpleFunction(description = " Calculate Power ")
    public int CalculatePower (int Workdone, int time) { 
    return Workdone * 1/time;
  
    }
  @SimpleFunction(description = " CalculateWorkdone ")
    public int CalculateWorkdone (int Force, int Displacement) { 
    return Force * Displacement;
  
    }
  @SimpleFunction(description = " CalculateKineticEnergy ")
    public int CalculateKineticEnergy (int mass, int velocity) { 
    return 1/2 * mass * velocity * velocity;
  
    }
  @SimpleFunction(description = " CalculateKineticEnergy ")
    public int CalculateGravitationalPotentialEnergy (int mass, int G, int height) { 
    return mass * G * height;
  
    }
}
