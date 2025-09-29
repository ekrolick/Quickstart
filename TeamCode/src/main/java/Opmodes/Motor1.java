package Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Motor1 extends LinearOpMode
{
    private DcMotor motor1;

    @Override
    public void runOpMode() throws InterruptedException {
        motor1 = hardwareMap.get(DcMotor.class, "squishymotor");
        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        telemetry.addData("Status", "Initialized");
        telemetry.update();
        motor1.setTargetPosition(0);

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                motor1.setTargetPosition(100);
            }
                if (gamepad1.b) {
                    motor1.setTargetPosition(500);
                }
                telemetry.addData("Status", "Running");
                telemetry.update();
            }
        }
    }
