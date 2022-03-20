package daftarmahasiswa;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String jurusan;
    
    public Mahasiswa(String a, String b, String c, String d){
        nim = a;
        nama = b;
        nilai = c;
        jurusan = d;
    }
    
    public void setNim(String a) {
        nim = a;
    }
    
    public void setNama(String b) {
        nama = b;
    }
    
    public void setNilai(String c) {
        nilai = c;
    }
        
    public void setJurusan(String d) {
        jurusan = d;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNilai() {
        return nilai;
    }
    
    public String getJurusan() {
        return jurusan;
    }
}
