/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import apoio.IDAO;
import entidade.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
/*import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;*/

/**
 *
 * @author dudub
 */
public class PessoaDAO implements IDAO<Pessoa> {

    /**
     *
     * @param p
     * @return
     */
    @Override
    public String salvar(Pessoa p) {
        try {
//            Statement stm = ferrados.Ferrados.conexao.createStatement();
            Statement stm = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO pessoa VALUES "
                    + "(default,"
                    + " '" + p.getNome()+ "',"
                    + " '" + p.getEndereco()+ "',"
                    + " '" + p.getTelefone()+ "',"
                    + " '" + p.getCpf()+ "', "
                    + " '" + p.getIsActive()+"')";

            System.out.println("SQL: " + sql);

            int resultado = stm.executeUpdate(sql);
            System.out.println(resultado);

            return null;
        } catch (Exception e) {
            System.out.println("Erro ao salvar pessoa: " + e);
            return e.toString();
        }
    }
    
    /**
     *
     * @return
     */
    public Pessoa consultaUltimaPessoa() {
        Pessoa pessoa = new Pessoa();
        try {
//            Statement stm = ferrados.Ferrados.conexao.createStatement();
            Statement stm = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT MAX(id) AS ultimo "
                    + "FROM pessoa";

            System.out.println("SQL: " + sql);
            ResultSet resultadoQ = stm.executeQuery(sql);
            
            if( resultadoQ.next() ){
                pessoa.setId(resultadoQ.getInt("ultimo"));
                pessoa.setEndereco("teste");
                pessoa.setTelefone("teste");
                pessoa.setCpf("teste");
                pessoa.setIsActive("teste");            
            }
            System.out.println(resultadoQ.getInt("ultimo"));         
        } catch (SQLException e) {
            System.out.println("Erro ao consultar última pessoa inserida: " + e);
        }
        return pessoa;
    }
    
    /**
     *
     * @param p
     * @return
     */
    @Override
    public String atualizar(Pessoa p) {
        String saida = null;

        /*try {
            Statement stm = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "UPDATE pessoa "
                    + "SET email = '" + o.getEmail()+ "', "
                    + "senha md5 = ('" + o.getSenha()+ "') "
                    + "where id = " + o.getId();

            System.out.println("SQL: " + sql);
            System.out.println("Cheguei no atualizar cadastro");
            System.out.println(o.getSenha());

            int retorno = stm.executeUpdate(sql);

            if (retorno != 0) {
                saida = null;
            } else {
                saida = "Erro";
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar cadastro: " + e);
            saida = e.toString();
        }*/

        return saida;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Pessoa> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    public boolean registroUnico(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param criterio
     * @return
     */
    @Override
    public ArrayList<Pessoa> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    public boolean consultar(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
