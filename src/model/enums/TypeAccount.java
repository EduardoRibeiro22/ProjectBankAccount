package model.enums;

public enum TypeAccount {

	BRONZE(0.05), SILVER(0.8), GOLD(0.12);

	private Double desconto;

	private TypeAccount(Double desconto) {
		this.desconto = desconto;
	}

	public Double getDesconto() {
		return desconto;
	}

}
