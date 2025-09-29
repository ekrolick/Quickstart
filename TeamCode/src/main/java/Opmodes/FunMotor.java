package Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class FunMotor extends LinearOpMode {
   private DcMotor motor1;
   private int motorSpeed = 1;
   @Override

   public void runOpMode() throws InterruptedException {
       motor1 = hardwareMap.get(DcMotor.class, "squishymotor");
       motor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
       motor1.setPower(0);


       telemetry.addData("Status", "Initialized");
       telemetry.update();


       waitForStart();

       while (opModeIsActive()) {
           motor1.setPower(motorSpeed * gamepad1.left_stick_y);
           
           telemetry.addData("Status", "Running");
           telemetry.update();
       }
   }
}
