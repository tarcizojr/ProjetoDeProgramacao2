package utilidades;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import projeto.Servico;

public class GeradorDeRelatorios {

    public static void gerarRelatorio(ArrayList <Servico> se) {
        Document doc = new Document(PageSize.A4);
        try {
            OutputStream os = new FileOutputStream("relatório.pdf");
            PdfWriter.getInstance(doc, os);

            doc.open();

            Paragraph pg = new Paragraph(se.toString());
            doc.add(pg);

            doc.close();

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();

        }
    }
}
