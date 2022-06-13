/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhnh.mathutil.test.core;

import com.thanhnh.mathutil.core.MathUlti;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ASUS
 */
public class MathUltiTest {

    // Đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    // để kiểm thử/kiểm tra code chính - hàm tínhGiaiThua() bên class core.MathUtil
    // viết code để test code chính bên kia !!!
    // có nhiều quy tắc đặt tên hàm kiểm thử
    // nhưng thường sẽ là nói lên mujch đích của các case/tình huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại !!!
    // hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    // ta sẽ xài hàm kiểu well - đưa 5!, 6! hk có chơi đưa -5!, 30!
    // @Test JUnit sẽ phối hợp vs JVM để chạy hàm này
    // @Test phía hậu trường chính là public static void main()
    // có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; // test thử tính huống từ tế đầu vào, mày phải chạy đúng
        long expected = 1; // hy vọng rằng 0! = 1

        //long actual = ; // gọi hàm cần test bên core/app chính/code chính
        long actual = MathUlti.getFactorial(n);

        // so sánh expected vs. actual dùng xanh xanh đỏ đỏ(framework)
        Assert.assertEquals(expected, actual);
        
        // gộp thêm vài case thành công/đưa vào ngon!!! hàm tính ngon
        Assert.assertEquals(1, MathUlti.getFactorial(1));
        Assert.assertEquals(2, MathUlti.getFactorial(2));
        Assert.assertEquals(6, MathUlti.getFactorial(3));
        Assert.assertEquals(24, MathUlti.getFactorial(4));
        Assert.assertEquals(120, MathUlti.getFactorial(5));
        Assert.assertEquals(240, MathUlti.getFactorial(6));

        // hàm giúp so sánh 2 giá trị nào đó có giống nhau hay ko
        // nếu giống nhau -> thẩy màu xanh đèn đường - đường thông, code ngon
        // ít nhất cho case đang test
        // nếu ko giống nhau -> thảy màu đỏ đèn đường
        // hàm ý expected và actual ko giống nhau
    }

    // hàm getF ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] -> tính đúng dc n! - done
    //2. đưa data vào cà chớn, âm, > 20; thiết kế của hàm là ném ra ngoại lệ
    //tao kì vọng ngoại lệ xuất hiện, khi n < 0 || n > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn này
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    // => hàm chạy đúng như thiết kế -> xanh phải xuất hiện
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lệ
    // sure, hàm chạy sai thiết kế, sai kì vọng, màu đỏ
    // Test case:
    // input : -5
    // expected: IllegalArgumantException xuất hiện
    // tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    // là những thứ ko thể do lường so sánh theo kiểu value
    // mà chỉ có thể đo lường = cách chúng có xuất hiện hay ko
    // assertEquals() ko thể dùng để so sánh 2 ngoại lệ
    // equal() là bằng nhau hay ko trên value !!!
    /*//    @Test(expected = NumberFormatException.class)
        Hàm có ném ngoại lệ thật sự
        nhưng ko phải là ngoại lệ như kì vọng - thực sự kì vọng sai, ko phải hàm ném sai
     */
    //cách 1
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUlti.getFactorial(-5);  // hàm @Test chayh, hay hàm getF chạy
        // sẽ ném về ngoại lệ NumberFormat...
    }

    // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn !!!
    // xài lambda
    // Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    // tui cần thấy màu xanh khi chơi với 21!
//    @Test
//    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
//
//        MathUlti.getFactorial(-5);  // hàm @Test chayh, hay hàm getF chạy
//        // sẽ ném về ngoại lệ NumberFormat...
//    }

    //test case 3
    // bắt ngoại lệ, xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    // có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {

        try {
            MathUlti.getFactorial(-5);
        } catch (Exception e) {
            // bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
            // nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko ???
            // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumantException xuất hiện
            
            Assert.assertEquals("Invalid argumment. N must be between 0..20", e.getMessage());
        }

    }

}
