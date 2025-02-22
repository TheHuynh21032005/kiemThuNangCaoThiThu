package org.example.phan2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class testPhan2SP {
    private sanPhamService spsv;

    @BeforeEach
    public void themSP() {
        spsv = new sanPhamService();
        spsv.themSP();
    }

    @Test
    public void xoaSPDau() {
        spsv.delete("SP001");
        assertEquals(0, spsv.getAll().size());
        assertFalse(spsv.getAll().stream().anyMatch(sanPham -> sanPham.getMa().equals("SP001")));
    }

    @Test
    public void xoaSPGiua() {
        spsv.delete("SP003");
        assertEquals(2, spsv.getAll().size());
        assertFalse(spsv.getAll().stream().anyMatch(sanPham -> sanPham.getMa().equals("SP003")));
    }

    @Test
    public void xoaSPCuoi() {
        spsv.delete("SP005");
        assertEquals(4, spsv.getAll().size());
        assertFalse(spsv.getAll().stream().anyMatch(sanPham -> sanPham.getMa().equals("SP005")));
    }

    @Test
    public void testDeleteAllSanPhams() {
        spsv.delete("SP001");
        spsv.delete("SP002");
        spsv.delete("SP003");
        spsv.delete("SP004");
        spsv.delete("SP005");
        assertEquals(0, spsv.getAll().size());
    }
}