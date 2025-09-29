package Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class FunServo extends LinearOpMode {
    private Servo servo1;

    @Override
    public void runOpMode() throws InterruptedException {
        servo1 = hardwareMap.get(Servo.class, "tastyservo");


        telemetry.addData("Status", "Initialized");
        telemetry.update();
        servo1.setPosition(1);

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                servo1.setPosition(1);
            }
            if (gamepad1.b) {
                servo1.setPosition(0);
            }
            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
