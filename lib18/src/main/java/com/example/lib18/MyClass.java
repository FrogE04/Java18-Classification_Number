package com.example.lib18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MyClass {
    public static void main(String[] agv) throws IOException {
        int[] num = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input Number : ");
        String s = br.readLine();
        char[] cArray = s.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            char tmp = cArray[i];
            switch (tmp){
                case '0':
                    num[0]++;
                    break;
                case '1':
                    num[1]++;
                    break;
                case '2':
                    num[2]++;
                    break;
                case '3':
                    num[3]++;
                    break;
                case '4':
                    num[4]++;
                    break;
                case '5':
                    num[5]++;
                    break;
                case '6':
                    num[6]++;
                    break;
                case '7':
                    num[7]++;
                    break;
                case '8':
                    num[8]++;
                    break;
                case '9':
                    num[9]++;
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "  count: " + num[i]);
        }
    }
}
