package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "a3") public class a3 extends LinearOpMode {
    Servo so;
    int min = 0;
    int max = 180;
    @Override public void runOpMode() {
        so = hardwareMap.get(Servo.class,"a");

        waitForStart();
        if (opModeIsActive()) {
            // Pre-run
            while (opModeIsActive()) {
                so.scaleRange(min, max);
                if(gamepad1.a){
                    so.setPosition(min);
                }
                else if(gamepad1.b){
                    so.setPosition(max);
                }
                // OpMode loop
            }
        }
    }
}
