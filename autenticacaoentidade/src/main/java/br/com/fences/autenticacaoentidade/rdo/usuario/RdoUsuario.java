package br.com.fences.autenticacaoentidade.rdo.usuario;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.autenticacaoentidade.rdo.delegacia.RdoDelegacia;

public class RdoUsuario implements Serializable{

	private static final long serialVersionUID = -1845500545241277503L;

	@SerializedName("_id")
	private String id;
	
	@SerializedName("RG_USUARIO")
	private String rgUsuario;
	
	@SerializedName("NOME_USUARIO")
	private String nomeUsuario;
	
	@SerializedName("SENHA_USUARIO")
	private String senhaUsuario;
	
	@SerializedName("ID_DELEGACIA")
	private String idDelegacia;
	
	@SerializedName("CARGO_USUARIO")
	private String cargoUsuario;
	
	@SerializedName("FLAG_EM_OPERACAO")
	private String flagEmOperacao;
	
	@SerializedName("FLAG_ATIVO_USUARIO")
	private String flagAtivoUsuario;
	
	@SerializedName("ID_PERFIL")
	private String idPerfil;
	
	@SerializedName("UTILIZANDO_JAVA")
	private String utilizandoJava;
	
	@SerializedName("FLAG_USUARIO_MASTER")
	private String flagUsuarioMaster;
	
	@SerializedName("FLAG_CONFIDENCIAL")
	private String flagConfidencial;
	
	@SerializedName("FLAG_PROVIMENTO_32")
	private String flagProvimento32;
	
	@SerializedName("FLAG_DEL_PRESERVADA")
	private String flagDelPreservada;
	
	@SerializedName("FLAG_EDIT_DOC")
	private String flagEditDoc;
	
	@SerializedName("FLAG_ACESSA_IP")
	private String flagAcessaIp;
	
	@SerializedName("CPF")
	private String Cpf;
	
	/**
	 * Essa informacao nao eh incluida em banco de dados, apenas associada na camada de negocio.
	 * Nao foi colocada como Transient para nao comprometer a transformacao para JSON.
	 */
	private RdoDelegacia rdoDelegacia;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRgUsuario() {
		return rgUsuario;
	}

	public void setRgUsuario(String rgUsuario) {
		this.rgUsuario = rgUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getIdDelegacia() {
		return idDelegacia;
	}

	public void setIdDelegacia(String idDelegacia) {
		this.idDelegacia = idDelegacia;
	}

	public String getCargoUsuario() {
		return cargoUsuario;
	}

	public void setCargoUsuario(String cargoUsuario) {
		this.cargoUsuario = cargoUsuario;
	}

	public String getFlagEmOperacao() {
		return flagEmOperacao;
	}

	public void setFlagEmOperacao(String flagEmOperacao) {
		this.flagEmOperacao = flagEmOperacao;
	}

	public String getFlagAtivoUsuario() {
		return flagAtivoUsuario;
	}

	public void setFlagAtivoUsuario(String flagAtivoUsuario) {
		this.flagAtivoUsuario = flagAtivoUsuario;
	}

	public String getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(String idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getUtilizandoJava() {
		return utilizandoJava;
	}

	public void setUtilizandoJava(String utilizandoJava) {
		this.utilizandoJava = utilizandoJava;
	}

	public String getFlagUsuarioMaster() {
		return flagUsuarioMaster;
	}

	public void setFlagUsuarioMaster(String flagUsuarioMaster) {
		this.flagUsuarioMaster = flagUsuarioMaster;
	}

	public String getFlagConfidencial() {
		return flagConfidencial;
	}

	public void setFlagConfidencial(String flagConfidencial) {
		this.flagConfidencial = flagConfidencial;
	}

	public String getFlagProvimento32() {
		return flagProvimento32;
	}

	public void setFlagProvimento32(String flagProvimento32) {
		this.flagProvimento32 = flagProvimento32;
	}

	public String getFlagDelPreservada() {
		return flagDelPreservada;
	}

	public void setFlagDelPreservada(String flagDelPreservada) {
		this.flagDelPreservada = flagDelPreservada;
	}

	public String getFlagEditDoc() {
		return flagEditDoc;
	}

	public void setFlagEditDoc(String flagEditDoc) {
		this.flagEditDoc = flagEditDoc;
	}

	public String getFlagAcessaIp() {
		return flagAcessaIp;
	}

	public void setFlagAcessaIp(String flagAcessaIp) {
		this.flagAcessaIp = flagAcessaIp;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public RdoDelegacia getRdoDelegacia() {
		return rdoDelegacia;
	}

	public void setRdoDelegacia(RdoDelegacia rdoDelegacia) {
		this.rdoDelegacia = rdoDelegacia;
	}
	
	

}
