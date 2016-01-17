package br.com.fences.autenticacaoentidade.rdo.delegacia;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class RdoDelegacia implements Serializable{

	private static final long serialVersionUID = -1845500545241277503L;

	@SerializedName("_id")
	private String id;
	
	@SerializedName("ID_DELEGACIA")
	private String idDelegacia;
	
	@SerializedName("NOME_DELEGACIA")
	private String nomeDelegacia;
	
	@SerializedName("FANTASIA_DELEGACIA")
	private String fantasiaDelegacia;
	
	@SerializedName("NOME_DELEGADO")
	private String nomeDelegado;
	
	@SerializedName("ID_SECCIONAL")
	private String idSeccional;
	
	@SerializedName("LOGRADOURO_DELEGACIA")
	private String logradouroDelegacia;
	
	@SerializedName("NUMERO_LOGRADOURO_DELAGACIA")
	private String numeroLogradouroDelegacia;
	
	@SerializedName("COMPLEMENTO_DELEGACIA")
	private String complementoDelegacia;
	
	@SerializedName("CEP_DELEGACIA")
	private String cepDelegacia;
	
	@SerializedName("BAIRRO_DELEGACIA")
	private String bairroDelegacia;
	
	@SerializedName("ID_MUNICIPIO")
	private String idMunicipio;
	
	@SerializedName("ID_UF")
	private String idUf;
	
	@SerializedName("FLAG_INFOCRIM")
	private String flagInfocrim;
	
	@SerializedName("DDD_TELEFONE")
	private String dddTelefone;
	
	@SerializedName("TELEFONE_PLANTAO")
	private String telefonePlantao;
	
	@SerializedName("TELEFONE_INVESTIGADORES")
	private String telefoneInvestigadores;
	
	@SerializedName("TELEFONE_CARTORIO")
	private String telefoneCartorio;
	
	@SerializedName("TELEFONE_TITULAR")
	private String telefoneTitular;
	
	@SerializedName("FLAG_JAVA")
	private String flagJava;
	
	@SerializedName("UTILIZANDO_JAVA")
	private String utilizandoJava;
	
	@SerializedName("FLAG_BLOQUEIO_RG")
	private String flagBloqueioRg;
	
	@SerializedName("FLAG_BLOQUEIO_VEICULO")
	private String flagBloqueioVeiculo;
	
	@SerializedName("FLAG_BLOQUEIO_DESAPARECIDO")
	private String flagBloqueioDesaparecido;
	
	@SerializedName("FLAG_IMPRESSAO_CLIENTE")
	private String flagImpressaoCliente;
	
	@SerializedName("FLAG_PRESERVADA")
	private String flagPreservada;
	
	@SerializedName("FLAG_DEFENSORIA")
	private String flagDefensoria;
	
	@SerializedName("FLAG_CAP")
	private String flagCap;
	
	@SerializedName("FLAG_LAT_LONG")
	private String flagLatLong;
	
	@SerializedName("FLAG_ATIVO")
	private String flagAtivo;
	
	@SerializedName("FLAG_EDIT_DOC")
	private String flagEditDoc;
	
	@SerializedName("FLAG_UTILIZA_IP")
	private String flagUtilizaIp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdDelegacia() {
		return idDelegacia;
	}

	public void setIdDelegacia(String idDelegacia) {
		this.idDelegacia = idDelegacia;
	}

	public String getNomeDelegacia() {
		return nomeDelegacia;
	}

	public void setNomeDelegacia(String nomeDelegacia) {
		this.nomeDelegacia = nomeDelegacia;
	}

	public String getFantasiaDelegacia() {
		return fantasiaDelegacia;
	}

	public void setFantasiaDelegacia(String fantasiaDelegacia) {
		this.fantasiaDelegacia = fantasiaDelegacia;
	}

	public String getNomeDelegado() {
		return nomeDelegado;
	}

	public void setNomeDelegado(String nomeDelegado) {
		this.nomeDelegado = nomeDelegado;
	}

	public String getIdSeccional() {
		return idSeccional;
	}

	public void setIdSeccional(String idSeccional) {
		this.idSeccional = idSeccional;
	}

	public String getLogradouroDelegacia() {
		return logradouroDelegacia;
	}

	public void setLogradouroDelegacia(String logradouroDelegacia) {
		this.logradouroDelegacia = logradouroDelegacia;
	}

	public String getNumeroLogradouroDelegacia() {
		return numeroLogradouroDelegacia;
	}

	public void setNumeroLogradouroDelegacia(String numeroLogradouroDelegacia) {
		this.numeroLogradouroDelegacia = numeroLogradouroDelegacia;
	}

	public String getComplementoDelegacia() {
		return complementoDelegacia;
	}

	public void setComplementoDelegacia(String complementoDelegacia) {
		this.complementoDelegacia = complementoDelegacia;
	}

	public String getCepDelegacia() {
		return cepDelegacia;
	}

	public void setCepDelegacia(String cepDelegacia) {
		this.cepDelegacia = cepDelegacia;
	}

	public String getBairroDelegacia() {
		return bairroDelegacia;
	}

	public void setBairroDelegacia(String bairroDelegacia) {
		this.bairroDelegacia = bairroDelegacia;
	}

	public String getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getIdUf() {
		return idUf;
	}

	public void setIdUf(String idUf) {
		this.idUf = idUf;
	}

	public String getFlagInfocrim() {
		return flagInfocrim;
	}

	public void setFlagInfocrim(String flagInfocrim) {
		this.flagInfocrim = flagInfocrim;
	}

	public String getDddTelefone() {
		return dddTelefone;
	}

	public void setDddTelefone(String dddTelefone) {
		this.dddTelefone = dddTelefone;
	}

	public String getTelefonePlantao() {
		return telefonePlantao;
	}

	public void setTelefonePlantao(String telefonePlantao) {
		this.telefonePlantao = telefonePlantao;
	}

	public String getTelefoneInvestigadores() {
		return telefoneInvestigadores;
	}

	public void setTelefoneInvestigadores(String telefoneInvestigadores) {
		this.telefoneInvestigadores = telefoneInvestigadores;
	}

	public String getTelefoneCartorio() {
		return telefoneCartorio;
	}

	public void setTelefoneCartorio(String telefoneCartorio) {
		this.telefoneCartorio = telefoneCartorio;
	}

	public String getTelefoneTitular() {
		return telefoneTitular;
	}

	public void setTelefoneTitular(String telefoneTitular) {
		this.telefoneTitular = telefoneTitular;
	}

	public String getFlagJava() {
		return flagJava;
	}

	public void setFlagJava(String flagJava) {
		this.flagJava = flagJava;
	}

	public String getUtilizandoJava() {
		return utilizandoJava;
	}

	public void setUtilizandoJava(String utilizandoJava) {
		this.utilizandoJava = utilizandoJava;
	}

	public String getFlagBloqueioRg() {
		return flagBloqueioRg;
	}

	public void setFlagBloqueioRg(String flagBloqueioRg) {
		this.flagBloqueioRg = flagBloqueioRg;
	}

	public String getFlagBloqueioVeiculo() {
		return flagBloqueioVeiculo;
	}

	public void setFlagBloqueioVeiculo(String flagBloqueioVeiculo) {
		this.flagBloqueioVeiculo = flagBloqueioVeiculo;
	}

	public String getFlagBloqueioDesaparecido() {
		return flagBloqueioDesaparecido;
	}

	public void setFlagBloqueioDesaparecido(String flagBloqueioDesaparecido) {
		this.flagBloqueioDesaparecido = flagBloqueioDesaparecido;
	}

	public String getFlagImpressaoCliente() {
		return flagImpressaoCliente;
	}

	public void setFlagImpressaoCliente(String flagImpressaoCliente) {
		this.flagImpressaoCliente = flagImpressaoCliente;
	}

	public String getFlagPreservada() {
		return flagPreservada;
	}

	public void setFlagPreservada(String flagPreservada) {
		this.flagPreservada = flagPreservada;
	}

	public String getFlagDefensoria() {
		return flagDefensoria;
	}

	public void setFlagDefensoria(String flagDefensoria) {
		this.flagDefensoria = flagDefensoria;
	}

	public String getFlagCap() {
		return flagCap;
	}

	public void setFlagCap(String flagCap) {
		this.flagCap = flagCap;
	}

	public String getFlagLatLong() {
		return flagLatLong;
	}

	public void setFlagLatLong(String flagLatLong) {
		this.flagLatLong = flagLatLong;
	}

	public String getFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(String flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

	public String getFlagEditDoc() {
		return flagEditDoc;
	}

	public void setFlagEditDoc(String flagEditDoc) {
		this.flagEditDoc = flagEditDoc;
	}

	public String getFlagUtilizaIp() {
		return flagUtilizaIp;
	}

	public void setFlagUtilizaIp(String flagUtilizaIp) {
		this.flagUtilizaIp = flagUtilizaIp;
	}
	
	
	
}
