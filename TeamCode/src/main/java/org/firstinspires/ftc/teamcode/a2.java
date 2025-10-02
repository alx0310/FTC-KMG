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
            while (opModeIsActive()) {
                if(!gamepad1.x){
                    f = false;
                }
                else if(!f){
                    f = true;
                    t = !t;
                        //mo.setPower((t) ? (-gamepad1.left_stick_y):0.0);
                }
                if(t){
                    mo.setPower(gamepad1.left_stick_y);//gamepad1.x 가 눌렸을 때 gamepad1.left_stick_y의 값을 받아 작동ㅇ
                }
                else if(!t){
                    mo.setPower(0.0);
                }
            }
        }
    }
}
