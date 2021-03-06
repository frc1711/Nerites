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

    //TALONS
    public static int frd = 4; 
    public static int fld = 2; 
    public static int rrd = 1; 
    public static int rld = 3; 

    public static int shooter = 0; 
    public static int shooterTwo = 5; 

    public static int flyWheel = 8;

    public static int climber = 6; 

    public static int pulley = 7;

    public static int intake = 9;  

    public static int colorWheel = 10;

    public static int winch = 11;

    //shooter PID loop Doubles
    public static double shooterkP = 0.0075; 
    public static double shooterkD = shooterkP * 5; 
    public static double shooterkI = 0.0001;
    public static double shooterkF = 0.09; 

    //pulley PID loop doubles
    public static double pulleykP = 0.05; 
    public static double pulleykD = shooterkP * 5;
    public static double pulleykI = 0.05; 
    public static double pulleykF = 0.45; 


    //DIO Ports
    public static int bottomSensor = 0; 
    public static int middleSensor = 1; 
    public static int topSensor = 2; 
  
    //Speed constants 
    //Not sticky balls:
    //speed = 8350, kF .077, kI .00027, kP .0075, kD kp  
    public static double flyWheelSpeed = 0.75;
    public static double colorSpeed = 0.2; 
    public static double pulleySpeed = .35; 
    public static double intakeSpeed = .45; 
    public static int shooterSpeed = 8700; 
    public static int shooterUBound = shooterSpeed + 2000; 
    public static int shooterLBound = shooterSpeed - 125; 

    //enums
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
