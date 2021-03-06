/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6014.robot.subsystems;

import org.usfirst.frc.team6014.robot.RobotMap;

import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A subsystem for sensors and vision processing.
 */
public class Perception extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	PigeonIMU pigeon = new PigeonIMU(RobotMap.pigeon);
	
	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	public double getHeading() {
		return pigeon.getFusedHeading();
	}
	
}
