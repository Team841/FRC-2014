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
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomoussingleShot extends CommandGroup {
    
    public  AutonomoussingleShot() {
        
        //Fire Sequence
      //  addSequential(new FireSequence());
        //Drive 2ft Forward
        addSequential(new DriveStraightToDistance(90.0,0.30,true));
        
        //Shoots Ball
        addSequential(new FireSequence());
        //Drives Straight 2 feet
        //addSequential (new DriveStraightToDistance(90.0,0.30,true));
    }
}
