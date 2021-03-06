// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package com.nashoba.robotics.subsystems;
import com.nashoba.robotics.RobotMap;
import com.nashoba.robotics.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Drive extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANJaguar cANJaguar1 = RobotMap.driveCANJaguar1;
    CANJaguar cANJaguar2 = RobotMap.driveCANJaguar2;
    CANJaguar cANJaguar3 = RobotMap.driveCANJaguar3;
    CANJaguar cANJaguar4 = RobotMap.driveCANJaguar4;
    RobotDrive robotDrive41 = RobotMap.driveRobotDrive41;
    Gyro gyro1 = RobotMap.driveGyro1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveDriveCommand());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public double getGyroAngle()
    {
	    return gyro1.getAngle();
    }
    public void driveMecanum(float x, float y, float z)
    {
	    robotDrive41.mecanumDrive_Cartesian(x, y, z, 0);
    }
}
