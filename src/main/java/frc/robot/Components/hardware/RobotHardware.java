package frc.robot.Components.hardware;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * This is where you define all your robot hardware (Ex: motor controllers, sensors etc)
 *  Template made by nicholas blackburn 
 */
public class RobotHardware{

    public Spark FrontR = new Spark(RobotMap.FrontR);
    public Spark FrontL = new Spark(RobotMap.BackR);

    public PWMTalonSRX BackRTalonSRX = new PWMTalonSRX(RobotMap.FrontL);
    public PWMTalonSRX backLTalonSRX = new PWMTalonSRX(RobotMap.BackL);


    
}