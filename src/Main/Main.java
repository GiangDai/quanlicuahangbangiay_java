package Main;

import QuanLyBG.controller.MyConnect;
import QuanLyBG.view.MainQuanLyView;

public class Main {

    public static void main(String[] args) {
        new MyConnect();

        changLNF("Nimbus");
        MainQuanLyView MainQuanLyGUI = new MainQuanLyView();
        
        MainQuanLyGUI.showWindow();
    }

    public static void changLNF(String nameLNF) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (nameLNF.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
