package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "a2")public class a2 extends LinearOpMode {
    DcMotor mo;
    boolean f = false;
    boolean t = false;
    @Override public void runOpMode() {
        waitForStart();
        if (opModeIsActive()) {
            mo = hardwareMap.get(DcMotor.class, "0");

            // Pre-run
            while (opModeIsActive()) {
                if(!gamepad1.x){
                    f = false;
                }
                else if(!f){
                    f = true;
                    t = !t;

                    mo.setPower((t) ? 0.5:0.0);
                }
                // OpMode loop
            }
        }
    }
}
