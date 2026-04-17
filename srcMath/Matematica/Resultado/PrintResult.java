package Matematica.Resultado;

import Matematica.Math1.Atribuicao;
import Matematica.Math1.Tabuada;

/**
 * @author Álef Dutra
 * @see Atribuicao
 */
public class PrintResult extends Atribuicao {

    public String propriedadePublic;
    private String propriedadePrivate;
    String propriedadeString;

    /**
     * @protected Atributo herdado e sobrescrito com acesso protegido.
     */
    protected String propriedadeProtected;

    public static void main(String[] args) {
        Atribuicao atribuicao = new Atribuicao();
        Tabuada t = new Tabuada();
        t.mathTabuada(1);
        atribuicao.functionTeste();
        atribuicao.getPropriedadePrivate();
    }
}