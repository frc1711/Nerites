/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/** 
* @author: Lou DeZeeuw, Gabe Seaver  
*/

public class Pulley extends SubsystemBase implements PIDHelp {
  
  WPI_TalonSRX pulleyTalon;

  public static final int timeToIndex = Constants.timeToIndex;

  public Pulley() {
    pulleyTalon = new WPI_TalonSRX(Constants.pulley);

    pulleyTalon.setSafetyEnabled(false); 

    pulleyTalon.config_kP(0, Constants.pulleykP); 
    pulleyTalon.config_kI(0, Constants.pulleykI); 
    pulleyTalon.config_kD(0, Constants.pulleykD); 
    pulleyTalon.config_kF(0, Constants.pulleykF); 
  }

  public void run(double speed) {
    pulleyTalon.set(speed);
  }
  
  public void stop() {
    pulleyTalon.set(0);
  }
  
  public double getRPM() {
    return PIDHelp.getRPM(pulleyTalon); 
  }

  public double getVelocity() {
    return PIDHelp.getVelocity(pulleyTalon); 
  }

  public void toVelocity(double velocity) {
    PIDHelp.toVelocity(pulleyTalon, velocity); 
  }

  public void toRPM(double RPM) {
    PIDHelp.toRPM(pulleyTalon, RPM); 
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}