package org.dimigo.oop;

public class Snack {
    String name;
    String company;
    int price;
    int number;

    public Snack(){ }
    public Snack(String name, String company, int price, int number){
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calcPrice(){
        return number*price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("이름 : ").append(name).append("\n제조사 : ").append(company).append("\n가격 : ").append(String.format("%,d",price)).append("\n개수 : ").append(number);
        return sb.toString();
    }
}
