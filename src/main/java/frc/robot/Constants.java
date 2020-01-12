/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static int frd = 1; 
    public static int fld = 2; 
    public static int rrd = 3; 
    public static int rld = 4; 

    public static int shooter = 0; 
    public static int shooterTwo = 5; 

    public static int climber = 6; 


    //SHOOTER PID (all placeholders) TODO: replace placeholders
    public static int kVelocity = 22000; 
    public static int kCruiseVelocity = kVelocity/2; 
    public static double kP = 0.0; 
    public static double kD = kP * 10; 
    public static double kI = 0;
    public static double kF = 1; 

    public static enum RoboDir { 
        LEFT (-1), 
        RIGHT (1), 
        STRAIGHT(0);
        
        private int num; 
    
        private RoboDir(int num) {
          this.num = num; 
        }
    
        public int getNum() {
          return this.num; 
        }
      }
}
