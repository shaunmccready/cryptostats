package dto;

public class CoinDTO {

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCoinName() {
		return coinName;
	}

	public void setCoinName(String coinName) {
		this.coinName = coinName;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getProofType() {
		return proofType;
	}

	public void setProofType(String proofType) {
		this.proofType = proofType;
	}

	public Integer getTotalCoinSupply() {
		return totalCoinSupply;
	}

	public void setTotalCoinSupply(Integer totalCoinSupply) {
		this.totalCoinSupply = totalCoinSupply;
	}
}
