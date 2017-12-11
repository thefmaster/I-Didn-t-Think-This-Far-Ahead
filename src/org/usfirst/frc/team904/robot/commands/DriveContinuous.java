package org.usfirst.frc.team904.robot.commands;

import org.usfirst.frc.team904.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class DriveContinuous extends Command{
	double forward, turn, strafe;
	Drivetrain driveTrain;
	
	DriveContinuous (double forward, double turn, double strafe, Drivetrain driveTrain){
		this.forward = forward;
		this.turn = turn;
		this.strafe = strafe;
		this.driveTrain = driveTrain;
		
	}
	
	protected void initialize() {
		requires (driveTrain);
		driveTrain.Drive(forward, turn, strafe);
		setInterruptible (true);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
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
