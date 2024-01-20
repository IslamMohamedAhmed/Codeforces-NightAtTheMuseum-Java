/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nightatthemuseum;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class NightAtTheMuseum {

    public static void main(String[] args) {
        String str;
        int sum = 0,mx,mn;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(i==0){
            mx = Math.max('a', str.charAt(i));
            mn = Math.min('a', str.charAt(i));       
            }
            else{
            mx = Math.max(str.charAt(i-1), str.charAt(i));
            mn = Math.min(str.charAt(i-1), str.charAt(i));       
            }
         
            
            sum+= Math.min(mx-mn,26-(mx-mn));
            
            
        }
        System.out.println(sum);
        
        

    }
}
