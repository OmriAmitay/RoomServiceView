package com.roomservice.entity;

public class OpportunityFormData {

	private Long opportunityId;
	private String entityType;
	private Integer entityId;
	private String arrival;
	private String departure;
	private Integer numOfNights = 1;
	private String board;
	private Double price;
	private Operator operator = Operator.LTE;
	private Currency currency = Currency.USD;
	private Filter filter = Filter.FREE_CANCELATION;
	private Boolean payAtTheHotel = false;
	private Boolean onRequest = false;
	private Boolean showSpecialDeals = false;
	private Boolean getPackageRates = false;
	private String countryCode;
	private Integer adultsCount = 2;
	private String defaultCurrency = Currency.USD.name();
	private Boolean active = true;
	private Boolean push;
    private PushInfo pushInfo;
	public Long getOpportunityId() {
		return opportunityId;
	}
	public void setOpportunityId(Long opportunityId) {
		this.opportunityId = opportunityId;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public Integer getNumOfNights() {
		return numOfNights;
	}
	public void setNumOfNights(Integer numOfNights) {
		this.numOfNights = numOfNights;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Filter getFilter() {
		return filter;
	}
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	public Boolean getPayAtTheHotel() {
		return payAtTheHotel;
	}
	public void setPayAtTheHotel(Boolean payAtTheHotel) {
		this.payAtTheHotel = payAtTheHotel;
	}
	public Boolean getOnRequest() {
		return onRequest;
	}
	public void setOnRequest(Boolean onRequest) {
		this.onRequest = onRequest;
	}
	public Boolean getShowSpecialDeals() {
		return showSpecialDeals;
	}
	public void setShowSpecialDeals(Boolean showSpecialDeals) {
		this.showSpecialDeals = showSpecialDeals;
	}
	public Boolean getGetPackageRates() {
		return getPackageRates;
	}
	public void setGetPackageRates(Boolean getPackageRates) {
		this.getPackageRates = getPackageRates;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Integer getAdultsCount() {
		return adultsCount;
	}
	public void setAdultsCount(Integer adultsCount) {
		this.adultsCount = adultsCount;
	}
	public String getDefaultCurrency() {
		return defaultCurrency;
	}
	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	public Boolean getPush() {
		return push;
	}
	public void setPush(Boolean push) {
		this.push = push;
	}
	public PushInfo getPushInfo() {
		return pushInfo;
	}
	public void setPushInfo(PushInfo pushInfo) {
		this.pushInfo = pushInfo;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
    
}