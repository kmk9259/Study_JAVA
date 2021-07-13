package 스터디.IO.hw3.model.vo;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1047918736911503609L;
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private Double discount;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, Calendar dates, Double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "title : "+title+", author : "+author+", price : "+price+" "
				+ dates.get(Calendar.YEAR)+"년 "+dates.get(Calendar.MONTH)+"월 "+dates.get(Calendar.DATE)+"일 "+"출간 , discount : "+discount;
	}
	
}
