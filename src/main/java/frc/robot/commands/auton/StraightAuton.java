/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Pulley;
import frc.robot.subsystems.Shooter;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class StraightAuton extends SequentialCommandGroup {
  /**
   * Creates a new StraightAuton.
   */
  public StraightAuton(DriveTrain driveTrain, Shooter shooter, Pulley pulley) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(
      //new DriveCorrect(driveTrain, 0.125, .1, -79.2),
      new DriveCorrect(driveTrain, .125, .125, -79.2), 
      new Shoot(shooter, pulley, 3)
    );
  }
}
