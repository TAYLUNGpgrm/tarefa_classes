package Matematica.Math1;

/**
 * @author Álef Dutra
 * @see Tabuada
 */
public class Atribuicao {

    public String propriedadePublic;
    private String propriedadePrivate;
    String propriedadeString;

    /**
     * @protected Atributo com acesso protegido para subclasses.
     */
    protected String propriedadeProtected;

    public static void main(String[] args) {

        Tabuada t = new Tabuada();
        t.mathTabuada(1);
    }

    public void functionTeste() {
        System.out.println("Função Teste - exibir");
    }

    public String getPropriedadePrivate() {
        return propriedadePrivate;
    }
}