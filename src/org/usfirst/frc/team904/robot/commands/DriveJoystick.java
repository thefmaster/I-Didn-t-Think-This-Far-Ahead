package org.usfirst.frc.team904.robot.commands;

import org.usfirst.frc.team904.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveJoystick extends Command{
	Drivetrain driveTrain;
	Joystick joystick;
	
	DriveJoystick (Joystick joystick, Drivetrain driveTrain){
		this.joystick = joystick;
		this.driveTrain = driveTrain;
		
	}
	
	protected void initialize() {
		requires (driveTrain);
		setInterruptible (true);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		driveTrain.Drive(joystick.getY(), joystick.getZ(), joystick.getX());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
	
}
