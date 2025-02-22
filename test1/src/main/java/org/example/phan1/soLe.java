package org.example.phan1;

public class soLe {
    public static int tongSole(int so){
        if (so < 1){
            return 0;
        }
        int tong = 0;

        for (int i = 1; i <= so; i += 2){
            tong += 1;
        }
        return tong;
    }
}
