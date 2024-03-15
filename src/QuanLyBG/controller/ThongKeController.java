/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBG.controller;

import QuanLyBG.model.ThongKe;

import java.util.ArrayList;

/**
 * @author User
 */
public class ThongKeController {

    public ThongKe thongKeDAO = new ThongKe();
    private ArrayList<Double> doanhThuThang;

    public ThongKe thongKe(int nam) {
        return thongKeDAO.getThongKe(nam);
    }

    public double getDoanhThuThang(int thang, int nam) {
        return thongKeDAO.getDoanhThuThang(thang, nam);
    }
}
