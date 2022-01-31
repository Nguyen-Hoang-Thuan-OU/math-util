/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangthuan.mathutil.core;

/**
 *
 * @author Nguyen Hoang Thuan
 */
public class MathUtil {

    // Hàm tính giai thừa, n! = 1 * 2 * ... * n
    // 0! = 1 và 1! = 1
    // 21! sẽ bị tràn kiểu long vì có 18 số 0
    // Không tính được âm giai thừa
    
    public static long getFactorial (int n){
        // Test-driven development
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0... 20");
        
        if (n == 0 || n == 1)
            return 1;
        
        // Phép nhân, khởi đầu giai thừa = 1
        long product = 1;
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    
}
