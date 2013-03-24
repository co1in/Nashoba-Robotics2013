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
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.Encoder.PIDSourceParameter;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Track extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Encoder quadratureEncoder1 = RobotMap.trackQuadratureEncoder1;
    AnalogChannel analogForce1 = RobotMap.trackAnalogForce1;
    AnalogChannel analogForce2 = RobotMap.trackAnalogForce2;
    Solenoid brakeSolenoid = RobotMap.trackBrakeSolenoid;
    SpeedController speedController1 = RobotMap.trackSpeedController1;
    SpeedController speedController2 = RobotMap.trackSpeedController2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new TrackIdleCommand());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

