package frc.team832.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Subsystem extends SubsystemBase {
    private boolean isInit = false;

   public Subsystem() {

        setDefaultCommand(defaultCommand);

        isInit = true;
   }
   
    public boolean initialize() {
        boolean successful = true;

        return successful;
    }

  
}