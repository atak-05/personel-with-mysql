public class Personel {
    private int id;
    private String ad;
    private int maas;

    public Personel(){
        this.setId(0);
        this.setAd("");
        this.setMaas(0);
    }
    public Personel(int id,String ad, int maas){
        this.setId(id);
        this.setAd(ad);
        this.setMaas(maas);
    }
    public int getMaas(){
        return maas;
    }
    public void setMaas( int maas) {
        this.maas = maas;
    }
    public String getAd(){
        return ad;
    }
    public void setAd( String ad){
        this.ad = ad;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

}
