package frc.robot.Components.hardware;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Spark;

/**
 * This is where you define all your robot hardware (Ex: motor controllers, sensors etc)
 *  Template and example made by nicholas blackburn 
 */
public class RobotHardware{

    // Drive train motor controllers

    Spark lSpark = new Spark(RobotMap.LSpark1);
    Spark lSpark2= new Spark(RobotMap.LSpart2);

    PWMTalonSRX rTalonSRX1 = new PWMTalonSRX(RobotMap.RTalon1);
    PWMTalonSRX rTalonSRX2 = new PWMTalonSRX(RobotMap.RTalon2);
}