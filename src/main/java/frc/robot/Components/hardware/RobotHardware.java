package frc.robot.Components.hardware;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * This is where you define all your robot hardware (Ex: motor controllers, sensors etc)
 *  Template and example made by nicholas blackburn 
 */
public class RobotHardware{

    // Drive train motor controllers

   // Creates Motor Controller Objects For Robots Drive train

    public static Spark FrontR = new Spark(RobotMap.FrontR);
    public static Spark FrontL = new Spark(RobotMap.FrontL);

    public static PWMTalonSRX BackR = new PWMTalonSRX(RobotMap.BackR);
    public static PWMTalonSRX BackL = new PWMTalonSRX(RobotMap.BackL);

   // This speed controller group links both motor controllers to run 2 motors at the same speed


    public static SpeedControllerGroup Left = new SpeedControllerGroup(RobotHardware.FrontL, RobotHardware.BackL);
    public static SpeedControllerGroup Right = new SpeedControllerGroup(RobotHardware.FrontR, RobotHardware.BackR);

}