
public class HangSanXuat {
    private String tenhang;
    private QuocGia quocgia;

    public HangSanXuat(String tenhang, QuocGia quocgia) {
        this.tenhang = tenhang;
        this.quocgia = quocgia;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public QuocGia getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(QuocGia quocgia) {
        this.quocgia = quocgia;
    }
    public String intenquocgia(){
        return this.quocgia.getTenquocgia();
    }
}
