package org.firstinspires.ftc.teamcode;

import android.drm.DrmRights;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "a4")
public class a4 extends LinearOpMode {
    @Override

    int i = 0;
    int spin = 0;
    DcMotor r;
    DcMotor l;
    DcMotor mo1;
    DcMotor mo2;
    Servo so1;
    boolean s = false;
    boolean t = false;
    boolean d = false;

    public void runOpMode() {
        waitForStart();
        if (opModeIsActive()) {
            // Pre-run
            mo1 = hardwareMap.get(DcMotor.class, "0, 1");//0 = 왼쪽 앞, 1 = 왼쪽 뒤
            mo2 = hardwareMap.get(DcMotor.class, "2, 3");//2 = 오른쪽 앞, 3 = 오른쪽 뒤
            r = hardwareMap.get(DcMotor.class, "0, 3");
            l = hardwareMap.get(DcMotor.class,"1, 2");
            so1 = hardwareMap.get(Servo.class, "a");
            //so1.getDirection(), Servo.Direction;
            while (opModeIsActive()){
                //so1.getDirection();
                so1.scaleRange(0, 180);
                if(!gamepad1.x){
                    s = false;
                }
                else if (!s) {
                    s = true;
                    t = !t;     //x키 누를 떄 boolean t가 true false로 바뀜
                }
                if(gamepad1.a){
                    d = !d;
                }
                if(t){//t가 참 일떄만 동작
                    so1.setPosition(90);
                    //so1.getPosition();
                    if(gamepad1.right_stick_x!=0){
                        i = i+((int)gamepad1.right_stick_x);
                        spin = 90+i;
                        so1.setPosition(spin);
                    }
                    else{
                        i = 0;
                    }
                    if(!d) {
                        mo1.setPower(gamepad1.left_stick_y);
                        mo2.setPower(-gamepad1.left_stick_y);
                    }
                    if(d){
                        if(gamepad1.left_stick_x<0){
                            r.setPower(gamepad1.left_stick_x);
                        }
                        else{
                            l.setPower(gamepad1.left_stick_x);
                        }
                    };
                }
            }
        }
    }
}
