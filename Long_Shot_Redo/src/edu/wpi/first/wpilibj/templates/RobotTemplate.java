/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Compressor;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
        Talon leftController = new Talon(1);
        Talon rightController = new Talon(2);
        RobotDrive chassis = new RobotDrive(leftController,rightController);
        Joystick leftStick = new Joystick(1);
        Joystick rightStick = new Joystick(2);
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() 
    {
        
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
    chassis.setSafetyEnabled(true);
    while (isOperatorControl() && isEnabled()) {
        chassis.tankDrive(leftStick, rightStick);
        Timer.delay(0.01);
    }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
 
    }
}
