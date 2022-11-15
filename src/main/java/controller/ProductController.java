package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import service.ProductService;

import java.io.File;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public String getAll(Model model) {
        model.addAttribute("product", productService.products);
        return "showProduct";
    }

    @GetMapping("/create")
    public String getCreate() {
        return "createProduct";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product, @ModelAttribute MultipartFile imgFile) throws Exception {
        String name = imgFile.getOriginalFilename();
        FileCopyUtils.copy(imgFile.getBytes(), new File("C:/CodeGym/module4/CRUD_Spring_MVC_UpDate/src/main/webapp/img/" + name));
        product.setImg("/" + name);
        productService.add(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/products";
    }
}



