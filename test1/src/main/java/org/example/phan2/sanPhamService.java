package org.example.phan2;

import java.util.ArrayList;
import java.util.List;

public class sanPhamService {
    public List<sanPham> list = new ArrayList<sanPham>();

    public List<sanPham> getAll(){
        return list;
    }

    public void add(sanPham sp) {
        list.add(sp);
    }

    public void delete(String ma){
        list.removeIf(sanPham -> sanPham.getMa().equals(ma));
    }

    public void themSP(){
        add(new sanPham("SP001", "Điện thoại", 2, 13000000.0f, 10, "Đồ điện tử"));
        add(new sanPham("SP002", "Máy tính", 2, 13000000.0f, 10, "Đồ điện tử"));
        add(new sanPham("SP003", "Xe đạp", 2, 13000000.0f, 10, "Phương tiện"));
        add(new sanPham("SP004", "Bếp từ", 2, 13000000.0f, 10, "Đồ gia dụng"));
        add(new sanPham("SP005", "Tủ lạnh", 2, 13000000.0f, 10, "Đồ gia dụng"));
    }

    public static void main(String[] args) {
        sanPhamService spsv = new sanPhamService();
        spsv.themSP();
        List<sanPham> sp = spsv.getAll();
    }
}
