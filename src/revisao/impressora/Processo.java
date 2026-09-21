package revisao.impressora;

public class Processo {
    private String pid;
    private String conteudo;
    
    public Processo() {
    }
    public Processo(String pid, String conteudo) {
        this.pid = pid;
        this.conteudo = conteudo;
    }
    
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
