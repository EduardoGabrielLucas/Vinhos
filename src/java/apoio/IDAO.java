/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

//import entidade.CompraProduto;
import java.util.ArrayList;

/**
 *
 * @author pretto
 * @param <T>
 */
public interface IDAO <T> {

    /**
     *
     * @param objeto
     * @return
     */
    public String salvar (T objeto);

    /**
     *
     * @param o
     * @return
     */
    public String atualizar(T o);

    /**
     *
     * @param id
     * @return
     */
    public String excluir(int id);

    /**
     *
     * @return
     */
    public ArrayList<T> consultarTodos();
   
    /**
     *
     * @param o
     * @return
     */
    public boolean registroUnico(T o);

    /**
     *
     * @param criterio
     * @return
     */
    public ArrayList<T> consultar(String criterio);

    /**
     *
     * @param o
     * @return
     */
    public boolean consultar (T o);
}
