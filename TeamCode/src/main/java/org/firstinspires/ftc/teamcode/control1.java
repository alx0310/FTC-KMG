package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "control1")
public class control1 extends LinearOpMode {
    DcMotor mo;
    @Override

    public void runOpMode() {
        mo = hardwareMap.get(DcMotor.class, "0");
        float no = (-gamepad1.left_stick_y+1)/2;
        //float no = gamepad1.left_stick_y;
        waitForStart();
        if (opModeIsActive()) {
            // Pre-run
            while (opModeIsActive()) {
                telemetry.update();
                float speed = (gamepad1.x=1 ?(int)gamepad1.left_stick_y:0);
                mo.setPower(speed);
            }
        }
    }
}