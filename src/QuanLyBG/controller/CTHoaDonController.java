package QuanLyBG.controller;

//import QuanLyBG.DAO.CTHoaDonDAO;
import QuanLyBG.model.CTHoaDon;
import QuanLyBG.model.HoaDon;

import java.util.ArrayList;

public class CTHoaDonController {

    private ArrayList<CTHoaDon> listCTHoaDon;
    private CTHoaDon ctHDDAO = new CTHoaDon();
    private HoaDonController hdBUS = new HoaDonController();

    public CTHoaDonController() {
        docListCTHoaDon();
    }

    public void docListCTHoaDon() {
        this.listCTHoaDon = ctHDDAO.getListCTHoaDon();
    }

    public ArrayList<CTHoaDon> getListCTHoaDon() {
        return listCTHoaDon;
    }

    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(String maHD) {
        int ma = Integer.parseInt(maHD);
        ArrayList<CTHoaDon> dsct = new ArrayList<>();

        for (CTHoaDon cthd : listCTHoaDon) {
            if (cthd.getMaHD() == ma)
                dsct.add(cthd);
        }

        return dsct;
    }

    public void addCTHoaDon(String maSP, String soLuong, String donGia, String thanhTien) {
        int ma = hdBUS.getMaHoaDonMoiNhat();

        donGia = donGia.replace(",","");
        thanhTien = thanhTien.replace(",", "");

        CTHoaDon cthd = new CTHoaDon();

        cthd.setMaHD(ma);
        cthd.setMaSP(Integer.parseInt(maSP));
        cthd.setDonGia(Integer.parseInt(donGia));
        cthd.setSoLuong(Integer.parseInt(soLuong));
        cthd.setThanhTien(Integer.parseInt(thanhTien));

        ctHDDAO.addCTHoaDon(cthd);
    }
}
