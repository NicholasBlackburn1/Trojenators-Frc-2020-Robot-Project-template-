package frc.robot.Components.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Components.hardware.OperatorInterface;
import frc.robot.Components.hardware.RobotHardware;

/**
 * This class is our Drivetrain Subsystem. it sets up and rus the drive train. 
 * 
 * Template made by Nicholas Blackburn
 */

public class DriveTrainSubsystem extends SubsystemBase {
    /**
     * Creates a new Subsystem.
     */
    public DriveTrainSubsystem() {
 
        

  
    }
  
    @Override
    public void periodic() {

        final DifferentialDrive Drive = new DifferentialDrive(RobotHardware.Left,RobotHardware.Right);
        
        Drive.arcadeDrive(OperatorInterface.)

    }
  }
  