package org.example.finalKeyword;
/**
 * youtube folksdev #19 final keyword
 *
 * @author H. Doğukan Yılmaz
 */
public class Product {

    // instance variables
    private int product_id;

    // code conventions -> static final full uppercase
    private static final int CATEGORY_ID; // declare edildigi satirda initialize edilmeli ya da static icinde edilmeli.

    // staticlerın initialize edildiği alan
    static {
        CATEGORY_ID = 12;
    }
    //final ile tanimlanan degiskenlerin setteri olmaz


    // fınal keywordunu kullandığımızda default constructor yerine smart constructor kullanılmalı
    // smart constructor
    public Product(int product_id){
        this.product_id = product_id;
    }

    public static void main(String[] args) {

        final Product product = new Product(9);


    }

}
