/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhnh.mathutil.main;

import com.thanhnh.mathutil.core.MathUlti;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế ko
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //vd: -5 coi tính dc hk
        //  0 coi tính mấy
        //  20 coi tính mấy
        //  21 coi tính ra mấy !!!
        // TEST CASE: một tình huống hàm/app/màn hình/tính năng dc đưa vào sử dụng
        //giả lập hành vi xài của ai đó !!
        
        // TEST CASE: là 1 tình huống sử dụng, xài app mà nó bao hàm
        // DATA đầu vào cụ thể nào đó
        // OUTPUT đầu ra ứng với xử lí của hàm/chức năng của app, dĩ nhiên dùng đầu vào để xử lí
        // Kì vọng: mong hàm sẽ trả về value nào đó ứng với input ở trên
        // SO SÁNH để xem kết quả có như kì vọng hay ko
        
        long expected = 120; //kì vọng hàm trả về 120 nếu tính 5!
        
        int n = 5;           //input
        long actual = MathUlti.getFactorial(n);
        System.out.println("Expected 5! = " + expected);
        System.out.println("Actual 5! = " + actual);
        
    }
}
