package unsa.edu.pe.manualdutic.recursos;

public class PdfDoc {
    String name_doc;
    String path_pdf;
    String btn_ver;

    public PdfDoc() {
    }

    public PdfDoc(String path_pdf, String name, String ver) {
        this.path_pdf = path_pdf;
        this.name_doc = name;
        this.btn_ver = ver;
    }

    public String getName_doc() {
        return name_doc;
    }

    public void setName_doc(String name_doc) {
        this.name_doc = name_doc;
    }

    public String getPath_pdf() {
        return path_pdf;
    }

    public void setPath_pdf(String path_pdf) {
        this.path_pdf = path_pdf;
    }

    public String getBtn_ver() {
        return btn_ver;
    }

    public void setBtn_ver(String btn_ver) {
        this.btn_ver = btn_ver;
    }
}
