// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc841.CometFRC2014.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc841.CometFRC2014.Robot;
/**
 *
 */
public class  CatchBall extends Command {
    public CatchBall() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.intakeTiltMechanisms);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
       // requires(Robot.frontRollerIntake);
        //requires(Robot.backRollerIntake);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.intakeTiltMechanisms.updateCatchState();
        Robot.intakeTiltMechanisms.updateCatchHighState();
        
        if (Robot.intakeTiltMechanisms.getCatchState()){
          //  Robot.frontRollerIntake.stop();
          //  Robot.backRollerIntake.StopIntake(); 
            if(Robot.intakeTiltMechanisms.getPotentiometer() < 2){
                Robot.intakeTiltMechanisms.tiltInwardBackIntake();
                Robot.intakeTiltMechanisms.tiltInwardFrontIntake();
            }
            Robot.intakeTiltMechanisms.clearCatchState();
        }
        
        if (Robot.intakeTiltMechanisms.getCatchHighState())
        {
            if(Robot.intakeTiltMechanisms.getPotentiometer() < 2){
               Robot.intakeTiltMechanisms.tiltInwardBackIntake();
               Robot.intakeTiltMechanisms.tiltInwardFrontIntake(); 
            }
            Robot.intakeTiltMechanisms.clearCatchHighState();
        }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
