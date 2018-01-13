package com.crypto.cryptostats.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Coin implements Serializable {

	private static final long serialVersionUID = 1L;


	private Integer id;

	private	String	url;

	private String	imageUrl;

	private String 	name;

	private String	symbol;

	private String	coinName;

	private String	algorithm;

	private String	proofType;

	private Integer	totalCoinSupply;

	@Autowired
	public Coin(Integer id, String url, String imageUrl, String name, String symbol, String coinName, String algorithm, String proofType, Integer totalCoinSupply) {
		this.id = id;
		this.url = url;
		this.imageUrl = imageUrl;
		this.name = name;
		this.symbol = symbol;
		this.coinName = coinName;
		this.algorithm = algorithm;
		this.proofType = proofType;
		this.totalCoinSupply = totalCoinSupply;
	}

	@Id
	@Column(name = "id", unique = true)
	@SequenceGenerator(name = "coin_id_seq", sequenceName = "public.coin_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "coin_id_seq")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "image_url")
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "symbol")
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Column(name = "coin_name")
	public String getCoinName() {
		return coinName;
	}

	public void setCoinName(String coinName) {
		this.coinName = coinName;
	}

	@Column(name = "algorithm")
	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	@Column(name = "proofType")
	public String getProofType() {
		return proofType;
	}

	public void setProofType(String proofType) {
		this.proofType = proofType;
	}

	@Column(name = "totalCoinSupply")
	public Integer getTotalCoinSupply() {
		return totalCoinSupply;
	}

	public void setTotalCoinSupply(Integer totalCoinSupply) {
		this.totalCoinSupply = totalCoinSupply;
	}
}
