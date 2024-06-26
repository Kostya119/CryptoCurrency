package portfolio;

import com.sun.source.tree.BreakTree;

public class CryptoCurrency {
    private String name;

    private String symbol;

    private double price;

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
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CryptoCurrency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

}
