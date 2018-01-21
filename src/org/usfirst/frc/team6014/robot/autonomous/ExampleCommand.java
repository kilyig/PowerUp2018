/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6014.robot.autonomous;

import edu.wpi.first.wpilibj.command.TimedCommand;

import org.usfirst.frc.team6014.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class ExampleCommand extends TimedCommand {
	
	double y,x;
	public ExampleCommand(double timeout,double y, double x) {
		super(timeout);
		this.y=y;
		this.x=x;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.drive.arcadeDrive(x,y);
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.drive.arcadeDrive(0, 0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.drive.arcadeDrive(0, 0);
	}
}
