package QuanLyBG.model;

import QuanLyBG.controller.MyConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SizeSP {

    private int maSize;
    private String tenSize;

    public SizeSP() {
    }

    public SizeSP(int maSize, String tenSize) {
        this.maSize = maSize;
        this.tenSize = tenSize;
    }

    public int getMaSize() {
        return maSize;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }
    public ArrayList<SizeSP> getDanhSachSize() {
        try {
            String sql = "SELECT * FROM Size";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<SizeSP> dss = new ArrayList<>();
            while (rs.next()) {
                SizeSP size = new SizeSP();
                size.setMaSize(rs.getInt(1));
                size.setTenSize(rs.getString(2));
                dss.add(size);
            }
            return dss;
        } catch (SQLException e) {
        }
        return null;
    }
}
