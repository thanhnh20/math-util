/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhnh.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUlti {
    // trong class này cung cấp cho ta rất nhiều hàm xử lí toàn học
    // clone class math của JDK
    // hàm thư viện xài chung cho ai đó, ko cần trang thái/giá trị
    // chọn thiết kế là hàm static

    // hàm tinh giai thừa !!!
    // n! = 1.2.3.4.5...n
    // ko có giai thừa âm cho số âm
    // 0! = 1! = 1 quy ước
    // giai thừa hàm đồ thị dóc đứng, tăng nhanh về giá trị
    // 20 giai thừa là 18 con số 0, vừa kịp cho kiểu long của java
    // 21! tràn của long
    // quy ước tính n! trong khoảng từ 0-20
    
    /*public static long getFactorial(int n){
        if(n<0 || n>20){
            throw new IllegalArgumentException("Invalid argumment. N must be between 0..20");
        }
        if(n == 0 || n == 1){
            return 1; // kết thúc cuộc chơi sớm nếu nhận được đầu vào đặt biệt
            
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }*/
    
    public static long getFactorial(int n){
        if(n<0 || n>20){
            throw new IllegalArgumentException("Invalid argumment. N must be between 0..20");
        }
        if(n == 0 || n == 1){
            return 1; // kết thúc cuộc chơi sớm nếu nhận được đầu vào đặc biệt         
        }
  
        return n * getFactorial(n-1); // công thức đệ quy
    }
    
    
    // Học đệ quy trong vòng 30s - RECURSION
    // Hiện tượng gọi lại chính mình với 1 quy mô khác
    // VD: con búp bê Nga, giống nhau và lồng trong nau
    // búp bê to, nhỏ hơn, nhỏ hơn nữa ,.... đến điểm dừng
    
    // tính giùm tui 6!
    // n! = 1.2.3.4.5.6. ... .n
    // 6! = 6 * 5!
    // 5! = 5 * 4!
    // ....
    // 2! = 2 * 1! // điểm dừng
    // quy ước 1! = 0! = 1;
    
    //chốt hạ: n! = n * (n-1)!
}
