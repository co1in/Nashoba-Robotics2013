// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package com.nashoba.robotics;
import com.nashoba.robotics.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Joystick pad;
    Joystick xPad;
    public OI() 
    {
        pad = new Joystick(1);
        
        xPad = new Joystick(2);    
        
        JoystickButton lStickButtonX = new JoystickButton(xPad, XPad.kLeftStickButton);
	lStickButtonX.whenPressed(new TippingDeployCommand());
	
	JoystickButton rStickButtonX = new JoystickButton(xPad, XPad.kRightStickButton);
	rStickButtonX.whenPressed(new TippingUndeployCommand());
	
	JoystickButton xButtonX = new JoystickButton(xPad, XPad.kXButton);
	xButtonX.whenPressed(new ShooterLoadCommand());
	
	JoystickButton bButtonX = new JoystickButton(xPad, XPad.kBButton);
	bButtonX.whenPressed(new ShooterStopCommand());
	
	JoystickButton rBumperButtonX = new JoystickButton(xPad, XPad.kRightBumperButton);
	rBumperButtonX.whenPressed(new TrackDriveSpeedCommand(0.3f));
	
	JoystickButton lBumperButtonX = new JoystickButton(xPad, XPad.kLeftBumperButton);
	lBumperButtonX.whenPressed(new TrackDriveSpeedCommand(-0.6f));
	
	JoystickButton startButtonX = new JoystickButton(xPad, XPad.kStartButton);
	startButtonX.whenPressed(new CompressorStartCommand());
	
	JoystickButton backButtonX = new JoystickButton(xPad, XPad.kBackButton);
	backButtonX.whenPressed(new CompressorAutomaticToggleCommand());
	
	JoystickButton yButtonX = new JoystickButton(xPad, XPad.kYButton);
	yButtonX.whenPressed(new TrackIdleCommand());
	
	JoystickButton aButtonX = new JoystickButton(xPad, XPad.kAButton);
	aButtonX.whenPressed(new ShooterRunCommand());
            
                
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Articulating Idle Command", new ArticulatingIdleCommand());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive Drive Command", new DriveDriveCommand());
        SmartDashboard.putData("Drive Brake Command", new DriveBrakeCommand());
        SmartDashboard.putData("Shooter Idle Command", new ShooterIdleCommand());
        SmartDashboard.putData("Shooter Load Command", new ShooterLoadCommand());
        SmartDashboard.putData("Shooter Stop Command", new ShooterStopCommand());
        SmartDashboard.putData("Track Idle Command", new TrackIdleCommand());
        SmartDashboard.putData("Track Drive Down Until Force Command", new TrackDriveDownUntilForceCommand());
        SmartDashboard.putData("Compressor Start Command", new CompressorStartCommand());
        SmartDashboard.putData("Compressor Stop Command", new CompressorStopCommand());
        SmartDashboard.putData("Tipping Deploy Command", new TippingDeployCommand());
        SmartDashboard.putData("Tipping Undeploy Command", new TippingUndeployCommand());
        SmartDashboard.putData("Tipping Idle Command", new TippingIdleCommand());
        SmartDashboard.putData("Shoot Four Times Command", new ShootFourTimesCommand());
        SmartDashboard.putData("Compressor Automatic Toggle Command", new CompressorAutomaticToggleCommand());
        SmartDashboard.putData("Track Deploy Brake Command", new TrackDeployBrakeCommand());
        SmartDashboard.putData("Track Undeploy Brake Command", new TrackUndeployBrakeCommand());
        SmartDashboard.putData("Shooter Run Command", new ShooterRunCommand());
        SmartDashboard.putData("Articulating Extend Command", new ArticulatingExtendCommand());
        SmartDashboard.putData("Articulating unextend Command", new ArticulatingunextendCommand());
        SmartDashboard.putData("Cancel All Command", new CancelAllCommand());
        SmartDashboard.putData("FixedDeployCommand", new FixedDeployCommand());
        SmartDashboard.putData("FixedundeployCommand", new FixedundeployCommand());
        SmartDashboard.putData("FixedIdleCommand", new FixedIdleCommand());
        SmartDashboard.putData("ArticulatingDeployCommand", new ArticulatingDeployCommand());
        SmartDashboard.putData("ArticulatingUndeployCommand", new ArticulatingUndeployCommand());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        SmartDashboard.putData("Tipping Idle Command", new TippingIdleCommand());
	
	
	SmartDashboard.putData("Tipping Deploy Command", new TippingDeployCommand());
	SmartDashboard.putData("Tipping Undeploy Command", new TippingUndeployCommand());
	SmartDashboard.putData("Shooter Load Command", new ShooterLoadCommand());
	SmartDashboard.putData("Shooter Stop Command", new ShooterStopCommand());
	SmartDashboard.putData("Track Drive Down Until Force Command", new TrackDriveDownUntilForceCommand());
	
	SmartDashboard.putData("Tipping Deploy Command", new TippingDeployCommand());
	SmartDashboard.putData("Tipping Undeploy Command", new TippingUndeployCommand());
	SmartDashboard.putData("Shoot Four Times Command", new ShootFourTimesCommand());
	SmartDashboard.putData("Shooter Load Command", new ShooterLoadCommand());
	SmartDashboard.putData("Shooter Run Command", new ShooterRunCommand());
	
	SmartDashboard.putBoolean("Compressor Automatic", false);
	SmartDashboard.putInt("SD Times Per Second", 5);
	SmartDashboard.putDouble("Shooter Jag Speed", 0);
	SmartDashboard.putDouble("TRACK DOWN SPEED", 0);
        
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public boolean getPadButton(int type)
    {
        return pad.getRawButton(type);
    }
    public float getPadRawAxis(int axis)
    {
        return (float)pad.getRawAxis(axis);
    }
    public float getXPadRawAxis(int axis)
    {
        return (float)xPad.getRawAxis(axis);
    }
    public boolean getXPadButton(int button)
    {
        return xPad.getRawButton(button);
    }
}
