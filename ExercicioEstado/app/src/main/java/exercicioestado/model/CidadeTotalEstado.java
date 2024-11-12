package exercicioestado.model;

public class CidadeTotalEstado {
    private String uf;
    private long total;

    

    public CidadeTotalEstado(String uf, long total) {
        this.uf = uf;
        this.total = total;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "CidadeTotalEstado [uf=" + uf + ", total=" + total + "]";
    }
    
    
}
