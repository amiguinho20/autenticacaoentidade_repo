package br.com.fences.autenticacaoentidade.usuario;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import com.google.gson.annotations.SerializedName;

import br.com.fences.autenticacaoentidade.rdo.usuario.RdoUsuario;

@SessionScoped
public class Usuario implements Serializable{

	private static final long serialVersionUID = -1845500545241277503L;

	@SerializedName("_id")
	private String id;
	private String username;
	private String password;
	private String rg; //-- o mesmo cadastrado no RDO para fazer um sincronismo.
	private String dataCriacao;
	private String dataAtualizacao;
	private String ativo;
	
	/**
	 * Essa informacao nao eh incluida em banco de dados, apenas associada na camada de negocio.
	 * Nao foi colocada como Transient para nao comprometer a transformacao para JSON.
	 */
	private RdoUsuario rdoUsuario;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public RdoUsuario getRdoUsuario() {
		return rdoUsuario;
	}
	public void setRdoUsuario(RdoUsuario rdoUsuario) {
		this.rdoUsuario = rdoUsuario;
	}
	

	
	
}
