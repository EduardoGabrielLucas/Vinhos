/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author gabri
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double precoCusto;
    private double precoVenda;
    private double percentualLucro;
    private int quantidade;
    private String isActive;
    private int idGrupoProduto;
    private int idSubGrupoProduto;
    private int idMarca;

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public double getPrecoCusto() {
        return precoCusto;
    }

    /**
     *
     * @param precoCusto
     */
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     *
     * @return
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     *
     * @param precoVenda
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     *
     * @return
     */
    public double getPercentualLucro() {
        return percentualLucro;
    }

    /**
     *
     * @param percentualLucro
     */
    public void setPercentualLucro(double percentualLucro) {
        this.percentualLucro = percentualLucro;
    }

    /**
     *
     * @return
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     *
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     *
     * @return
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     *
     * @param isActive
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    /**
     *
     * @return
     */
    public int getIdGrupoProduto() {
        return idGrupoProduto;
    }

    /**
     *
     * @param idGrupoProduto
     */
    public void setIdGrupoProduto(int idGrupoProduto) {
        this.idGrupoProduto = idGrupoProduto;
    }

    /**
     *
     * @return
     */
    public int getIdSubGrupoProduto() {
        return idSubGrupoProduto;
    }

    /**
     *
     * @param idSubGrupoProduto
     */
    public void setIdSubGrupoProduto(int idSubGrupoProduto) {
        this.idSubGrupoProduto = idSubGrupoProduto;
    }

    /**
     *
     * @return
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     *
     * @param idMarca
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    
    
    
}
