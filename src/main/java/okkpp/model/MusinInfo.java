package okkpp.model;

public class MusinInfo {
	private String pricture;
	private String catalog;
	private String description;

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPricture() {
		return pricture;
	}

	public void setPricture(String pricture) {
		this.pricture = pricture;
	}

	@Override
	public String toString() {
		return "MusinInfo [pricture=" + pricture + ", catalog=" + catalog + ", description=" + description + "]";
	}



}
