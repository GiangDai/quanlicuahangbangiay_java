package QuanLyBG.controller;

//import QuanLyBG.DAO.SizeSP;
import QuanLyBG.model.SizeSP;
import MyCustom.MyDialog;
import java.util.ArrayList;

public class SizeController {

    private SizeSP sizeDAO = new SizeSP();
    private ArrayList<SizeSP> listSize = null;
    
    public SizeController() {
        docDanhSachSize();
    }

    public void docDanhSachSize() {
        this.listSize = sizeDAO.getDanhSachSize();
    }

    public ArrayList<SizeSP> getDanhSachSize() {
        if (listSize == null) {
            getDanhSachSize();
        }
        return this.listSize;
    }

    public String getTenSize(int ma) {
        for (SizeSP size : listSize) {
            if (size.getMaSize() == ma) {
                return size.getMaSize() + " - " + size.getTenSize();
            }
        }
        return "";
    }
/*
    public boolean themSize(int maSize, String tenSize) {
        if (tenSize.trim().equals("")) {
            new MyDialog("Không được để trống tên Size!", MyDialog.ERROR_DIALOG);
            return false;
        }
        maSize += 1;
        SizeSP size = new SizeSP(maSize, tenSize);
        if (sizeDAO.themSize(size)) {
            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean xoaSize(String ma) {
        if (ma.trim().equals("")) {
            new MyDialog("Chưa chọn size để xoá!", MyDialog.SUCCESS_DIALOG);
            return false;
        }
        int maSize = Integer.parseInt(ma);
        if (sizeDAO.xoaSize(maSize)) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
            new MyDialog("Xoá thất bại! Size có sản phẩm con", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean suaSize(String ma, String ten) {
        if (ten.trim().equals("")) {
            new MyDialog("Không được để trống tên size!", MyDialog.ERROR_DIALOG);
            return false;
        }
        int maSize = Integer.parseInt(ma);
        if (sizeDAO.suaSize(maSize, ten)) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }
*/
}
