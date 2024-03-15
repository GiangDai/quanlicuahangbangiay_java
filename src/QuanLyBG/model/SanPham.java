package QuanLyBG.model;

import QuanLyBG.controller.MyConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SanPham {
    private int maSP;
    private String tenSP;
    private int maSize;
    private int soLuong;
    private String donViTinh;
    //private String hinhAnh;
    private int donGia;

    public SanPham() {

    }

    public SanPham(int maSP, String tenSP, int maSize, int soLuong, String donViTinh, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maSize = maSize;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        //this.hinhAnh = hinhAnh;
        this.donGia = donGia;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getMaSize() {
        return maSize;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

   /* public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
*/
    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public ArrayList<SanPham> getListSanPham() {
        try {
            String sql = "SELECT * FROM SanPham";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setTenSP(rs.getString(2));
                sp.setMaSize(rs.getInt(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
//                sp.setHinhAnh(rs.getString(6));
                sp.setDonGia(rs.getInt(6));

                dssp.add(sp);
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }

    public SanPham getSanPham(int ma) {
        try {
            String sql = "SELECT *FROM SanPham WHERE MaSP=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setTenSP(rs.getString(2));
                sp.setMaSize(rs.getInt(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
               // sp.setHinhAnh(rs.getString(6));
                sp.setDonGia(rs.getInt(6));

                return sp;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<SanPham> getSanPhamTheoLoai(int maSize) {
        try {
            String sql = "SELECT * FROM SanPham WHERE MaSize=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maSize);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setTenSP(rs.getString(2));
                sp.setMaSize(rs.getInt(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
               // sp.setHinhAnh(rs.getString(6));
                sp.setDonGia(rs.getInt(6));

                dssp.add(sp);
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }

    /*public String getAnh(int ma) {
        try {
            String sql = "SELECT HinhAnh FROM SanPham WHERE MaSP=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                return rs.getString("HinhAnh");
            }
        } catch (SQLException e) {
        }
        return "";
    }
*/
    public void capNhatSoLuongSP(int ma, int soLuongMat) {
        SanPham sp = getSanPham(ma);
        int soLuong = sp.getSoLuong();
        sp.setSoLuong(soLuong + soLuongMat);
        try {
            String sql = "UPDATE SanPham SET SoLuong=? WHERE MaSP=" + ma;
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, sp.getSoLuong());
            pre.executeUpdate();
        } catch (SQLException e) {
        }

    }

    public boolean themSanPham(SanPham sp) {
        try {
            String sql = "INSERT INTO SanPham(TenSP, MaSize, SoLuong, DonViTinh, DonGia) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sp.getTenSP());
            pre.setInt(2, sp.getMaSize());
            pre.setInt(3, sp.getSoLuong());
            pre.setString(4, sp.getDonViTinh());
            //pre.setString(5, sp.getHinhAnh());
            pre.setInt(5, sp.getDonGia());

            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    /*public boolean nhapSanPhamTuExcel(SanPham sp) {
        try {
            String sql = "DELETE * FROM SanPham; " +
                    "INSERT INTO SanPham(TenSP, MaLoai, SoLuong, DonViTinh, DonGia) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sp.getTenSP());
            pre.setInt(2, sp.getMaLoai());
            pre.setInt(3, sp.getSoLuong());
            pre.setString(4, sp.getDonViTinh());
           // pre.setString(5, sp.getHinhAnh());
            pre.setInt(5, sp.getDonGia());

            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }*/

    public boolean xoaSanPham(int maSP) {
        try {
            String sql = "DELETE FROM SanPham WHERE MaSP=" + maSP;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaSanPham(SanPham sp) {
        try {
            String sql = "UPDATE SanPham SET "
                    + "TenSP=?, "
                    + "MaSize=?, SoLuong=?, DonViTinh=?, DonGia=? "
                    + "WHERE MaSP=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sp.getTenSP());
            pre.setInt(2, sp.getMaSize());
            pre.setInt(3, sp.getSoLuong());
            pre.setString(4, sp.getDonViTinh());
          //  pre.setString(5, sp.getHinhAnh());
            pre.setInt(5, sp.getDonGia());
            pre.setInt(6, sp.getMaSP());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
