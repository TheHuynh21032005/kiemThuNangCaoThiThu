package org.example.phan2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class sanPham {
    private String ma;
    private String ten;
    private int namBH;
    private float gia;
    private int soLuong;
    private String danhMuc;
}
