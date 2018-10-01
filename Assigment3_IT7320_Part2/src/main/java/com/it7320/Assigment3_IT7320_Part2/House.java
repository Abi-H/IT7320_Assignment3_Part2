package com.it7320.Assigment3_IT7320_Part2;

public class House {
	int pricePerSquareMetre, squareMetres, bedrooms, bathrooms, bedroomPrice, bathroomPrice;
	String houseType;
	
	public House(int squareMetres, int bedrooms, int bathrooms, String houseType) {
		setHouseType(houseType);
		setBedrooms(bedrooms);
		setBathrooms(bathrooms);
		setSquareMetres(squareMetres);
		setPricePerSquareMetre(getHouseType());
		this.bedroomPrice = 30000;
		this.bathroomPrice = 25000;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getPricePerSquareMetre() {
		return pricePerSquareMetre;
	}

	public void setPricePerSquareMetre(String type) {
		if(type.equals("deluxe")) {
			this.pricePerSquareMetre = 1000;
		} else if (type.equals("custom")) {
			this.pricePerSquareMetre = 1500;
		} else if(type.equals("deluxe custom")) {
			this.pricePerSquareMetre = 2500;
		} else {
			setHouseType("basic");
			this.pricePerSquareMetre = 620;
		}
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public int getSquareMetres() {
		return squareMetres;
	}

	public void setSquareMetres(int squareMetres) {
		this.squareMetres = squareMetres;
	}
	
	public boolean withinBudget(int budget) {
		return getTotalPrice() <= budget;
	}
	
	public int bedroomsPerBathrooms() {
		return getBedrooms()/getBathrooms();
	}
	
	public int getTotalPrice() {
		return (pricePerSquareMetre*squareMetres) + (getBathrooms()*bathroomPrice) + (getBedrooms()*bedroomPrice);
	}
}
