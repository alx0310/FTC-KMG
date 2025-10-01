package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "a1")
public class a1 extends LinearOpMode {
    DcMotor mo;
    Servo no;
    @Override
    public void runOpMode() {
        waitForStart();
        if (opModeIsActive()) {
            mo = hardwareMap.get(DcMotor.class, "0");
            no = hardwareMap.get(.class,"a");
            // Pre-run
            while (opModeIsActive()) {
                if(gamepad1.a) {
                    mo.setPower(0.5);
                    no.
                }
                else if(gamepad1.b){
                    mo.setPower(0.0);
                    no.
                }

                // OpMode loop
            }
        }
    }
}
