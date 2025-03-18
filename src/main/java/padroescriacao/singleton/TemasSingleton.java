package padroescriacao.singleton;

public class TemasSingleton {

    private TemasSingleton() {};
    private static TemasSingleton instance = new TemasSingleton();

    public static TemasSingleton getInstance() {
        return instance;
    }

    private String temaAtual = "Claro";

    public String getTemaAtual() {
        return temaAtual;
    }

    public void setTemaAtual(String temaAtual) {
        this.temaAtual = temaAtual;
    }
}