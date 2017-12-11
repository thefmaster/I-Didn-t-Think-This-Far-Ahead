package org.usfirst.frc.team904.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{

	TalonSRX frontLeft;
	TalonSRX frontRight;
	TalonSRX backLeft;
	TalonSRX backRight;
	
	public void Drive (double forward, double turn, double strafe) {
		frontLeft.set(forward + turn - strafe);
		frontRight.set(forward - turn + strafe);
		backLeft.set(forward + turn + strafe);
		backRight.set(forward - turn - strafe);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
