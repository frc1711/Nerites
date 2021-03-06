/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import com.revrobotics.CANSparkMax.IdleMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

/** 
* @author: Lou DeZeeuw  
*/

public class WestCoastDrive extends CommandBase {

  private DriveTrain driveTrain; 
  private DoubleSupplier speed; 
  private DoubleSupplier rot; 
  private DoubleSupplier speedControl; 
  private BooleanSupplier flip; 
  private boolean batBack; 

  public WestCoastDrive(DriveTrain driveTrain, DoubleSupplier speed, DoubleSupplier rot, DoubleSupplier speedControl, BooleanSupplier flip) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);

    this.driveTrain = driveTrain; 
    this.speed = speed; 
    this.rot = rot; 
    this.speedControl = speedControl; 
    this.flip = flip; 
    batBack = false; 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveTrain.stop();
    driveTrain.zeroEncoders(); 
    driveTrain.setIdleMode(IdleMode.kCoast); 
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(flip.getAsBoolean())
      batBack = !batBack; 

    if (batBack){ 
      if(speedControl.getAsDouble() > .1)
        driveTrain.rawWestCoast(-speed.getAsDouble(), rot.getAsDouble());
      else 
        driveTrain.rawWestCoast(-speed.getAsDouble() * .65, rot.getAsDouble() * .75); 
    } else {
      if(speedControl.getAsDouble() > .1)
        driveTrain.rawWestCoast(speed.getAsDouble(), rot.getAsDouble()); 
      else 
        driveTrain.rawWestCoast(speed.getAsDouble() * .65, rot.getAsDouble() * .75); 
   }
 }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrain.stop(); 
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
