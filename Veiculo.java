package ptc2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Veiculo {
	@Id
	private Integer chassi;
	
	@Column (name="nomeFabricante")
	private String fabricante;
	
	@Column (name="descriçãoVeículo")
	private String descricao;
	
	@Column (name="versãoVeículo")
	private String versao;
	
	@Column (name="modeloVeículo")
	private String modelo;
	
	@Column (name="anoVeículo")
	private String ano;
	
	@Column (name="qtdeVeículo")
	private Integer qtde;
	
	public Veiculo() {}
	
	
	
	public Veiculo(Integer chassi, String fabricante, String descricao, String versao, String modelo, String ano,
			Integer qtde) {
		this.chassi = chassi;
		this.fabricante = fabricante;
		this.descricao = descricao;
		this.versao = versao;
		this.modelo = modelo;
		this.ano = ano;
		this.qtde = qtde;
	}
	
	public Integer getChassi() {
		return chassi;
	}
	public void setChassi(Integer chassi) {
		this.chassi = chassi;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public Integer getQtde() {
		return qtde;
	}
	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}



	@Override
	public String toString() {
		return "Veiculo [chassi=" + chassi + ", fabricante=" + fabricante + ", descricao=" + descricao + ", versao="
				+ versao + ", modelo=" + modelo + ", ano=" + ano + ", qtde=" + qtde + "]";
	}
	
	
	

}
