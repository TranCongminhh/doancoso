package quanli;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Inhoadon {
    public Inhoadon() {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String fileName = "hoa_don_" + timeStamp + ".pdf";
        Toancuc tc = new Toancuc();
        hoadon(tc.getHovaten(), tc.getBiensoxe(), tc.getMave(), tc.Loaixe, tc.Thoigiandk, tc.Thoigianhethan, tc.Tongtien, fileName);
    }

    public void hoadon(String Hovaten, String Biensoxe, String Mave, String Loaixe, String Tgdk, String Tghh, int Tongtien, String fileName) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
            document.add(new Paragraph("       HOA DON DANG KY VE THANG  "));
            document.add(new Paragraph("Ho va ten khach hang:      " + Hovaten));
            document.add(new Paragraph("Bien so xe:                " + Biensoxe));
            document.add(new Paragraph("Ma ve:                     " + Mave));
            document.add(new Paragraph("Loai xe:                   " + Loaixe));
            document.add(new Paragraph("Thoi gian dang ky:         " + Tgdk));
            document.add(new Paragraph("Thoi gian het han:         " + Tghh));
            document.add(new Paragraph("Tong tien:                 " + Tongtien + "VNĐ"));
            document.close();
            System.out.println("Hóa đơn đã được tạo thành công!");

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi tạo hóa đơn!");
            e.printStackTrace();
        }
    }
}
