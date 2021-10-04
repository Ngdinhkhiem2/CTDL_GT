package tuan02;

public class SinhVienTestDriven {

  public static void main(String[] args) {
      SinhVien sinhVien;//khai báo biến tên sinhvien tham chiếu đối tượng kiểu sinh viên
        
        sinhVien = new SinhVien();
        sinhVien.mssv = "2008110301";
        sinhVien.tenSinhVien = "Nguyễn Đình Khiêm";
        sinhVien.queQuan = "TPHCM";
        sinhVien.tuoi = 18;

        sinhVien.inThongTinSV();
    }

    
}
