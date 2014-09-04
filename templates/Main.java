/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
//Team Number -> 4613
public class Main extends IterativeRobot {
    //Joystick Initialisation
    Joystick primaryStick = new Joystick(1);
    Joystick secondaryStick = new Joystick(2);
    //Joystick Instances
    double stickX;
    double stickY;
    //Robot Movement Controllers
    double speed;
    double rotation;
    //Drive
    RobotDrive drive = new RobotDrive(1, 2);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                

    public void robotInit() {
        drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    }

    public void autonomousPeriodic() { 
    }
    
    public void teleopPeriodic() {
        stickX = primaryStick.getX();
        stickY = primaryStick.getY();

        speed = -stickX;
        rotation = -stickY;

        drive.arcadeDrive(speed, rotation);
    }
}
