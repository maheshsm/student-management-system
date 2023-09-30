import java.time.LocalDate;

public class ProductDetailsRes {

	private Integer productId;
	private String categoryName;
	private String discountName;
	private String name;
	private Double pricePerQuantity;
	private Double pricePerKg;
	private Double pricePerLtr;
	private Integer totalQuantity;
	private Integer totalKg;
	private Integer totalLtr;
	private Double totalPrice;
	private Boolean isWarranty;
	private LocalDate warrantyDate;
	private Boolean isGuarantee;
	private LocalDate guaranteeDate;
	private Double sgst;
	private Double cgst;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPricePerQuantity() {
		return pricePerQuantity;
	}
	public void setPricePerQuantity(Double pricePerQuantity) {
		this.pricePerQuantity = pricePerQuantity;
	}
	public Double getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(Double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public Double getPricePerLtr() {
		return pricePerLtr;
	}
	public void setPricePerLtr(Double pricePerLtr) {
		this.pricePerLtr = pricePerLtr;
	}
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public Integer getTotalKg() {
		return totalKg;
	}
	public void setTotalKg(Integer totalKg) {
		this.totalKg = totalKg;
	}
	public Integer getTotalLtr() {
		return totalLtr;
	}
	public void setTotalLtr(Integer totalLtr) {
		this.totalLtr = totalLtr;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Boolean getIsWarranty() {
		return isWarranty;
	}
	public void setIsWarranty(Boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}
	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	public Boolean getIsGuarantee() {
		return isGuarantee;
	}
	public void setIsGuarantee(Boolean isGuarantee) {
		this.isGuarantee = isGuarantee;
	}
	public LocalDate getGuaranteeDate() {
		return guaranteeDate;
	}
	public void setGuaranteeDate(LocalDate guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
	}
	public Double getSgst() {
		return sgst;
	}
	public void setSgst(Double sgst) {
		this.sgst = sgst;
	}
	public Double getCgst() {
		return cgst;
	}
	public void setCgst(Double cgst) {
		this.cgst = cgst;
	}
	
	@Override
	public String toString() {
		return "ProductDetailsRes [productId=" + productId + ", categoryName=" + categoryName + ", discountName="
				+ discountName + ", name=" + name + ", pricePerQuantity=" + pricePerQuantity + ", pricePerKg="
				+ pricePerKg + ", pricePerLtr=" + pricePerLtr + ", totalQuantity=" + totalQuantity + ", totalKg="
				+ totalKg + ", totalLtr=" + totalLtr + ", totalPrice=" + totalPrice + ", isWarranty=" + isWarranty
				+ ", warrantyDate=" + warrantyDate + ", isGuarantee=" + isGuarantee + ", guaranteeDate=" + guaranteeDate
				+ ", sgst=" + sgst + ", cgst=" + cgst + "]";
	}
}
