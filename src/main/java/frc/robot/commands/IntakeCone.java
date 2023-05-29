package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeCone extends CommandBase {
   public final TalonFX intakeMotor = new TalonFX(9);
   
    @Override
    public void initialize() {
        intakeMotor.set(TalonFXControlMode.PercentOutput, -0.5);
    }
    @Override
    public void end(boolean interrupted) {
        intakeMotor.set(TalonFXControlMode.PercentOutput, 0);
    }
}