package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Buku> Buku = new ArrayList<Buku>();

        Buku.add(new Buku("1811","Harry Potter","2013","J.K Rowling",500000,1));
        Buku.add(new Buku("2603","After","2019","Jenny Cage",250000,2));
        Buku.add(new Buku("0903","Alita","2021","Rosa Salazar",120000,3));

        Buku.get(0).setjudulbuku("Harry Potter");
        Buku.get(0).settahunterbit("2013");
        Buku.get(0).setPrice(500000);
        Buku.get(0).setRating(1);

        for (Buku buku:Buku){
            buku.searchisbn("1811");
        }

        Buku.remove(0);

        for (Buku buku:Buku){
            System.out.println(buku);

        }
    }
}
