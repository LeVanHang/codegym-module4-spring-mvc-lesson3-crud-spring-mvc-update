package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(001, "Hang", "http://hanoimoi.com.vn/Uploads/tuandiep/2018/4/8/1(1).jpg", 2000.0));
        products.add((new Product(002, "Luan", "https://kynguyenlamdep.com/wp-content/uploads/2020/01/hinh-anh-chu-chim-dep.jpg", 2000.0)));
        products.add(new Product(003, "Sang", "https://kynguyenlamdep.com/wp-content/uploads/2020/01/hinh-anh-chu-chim-dep.jpg", 2000.0));
    }

    public void add(Product product) {
        products.add(product);
    }

    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }
}