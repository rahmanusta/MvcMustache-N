package com.kodcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView test() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        List<Book> kitaplar =
                Arrays.asList(
                        new Book("Java ve Yazılım Tasarımı", 35d, "Altuğ B. Altıntaş", true),
                        new Book("Java Mimarisiyle Kurumsal Çözümler", 23d, "Rahman Usta", true),
                        new Book("Veri Yapıları ve Algoritmalar", 40d, "Rifat Çölkesen", false),
                        new Book("Veri Yapıları ve Algoritmalar", 40d, "Rifat Çölkesen", false),
                        new Book("Veri Yapıları ve Algoritmalar", 40d, "Rifat Çölkesen", true),
                        new Book("Mobil Pazarlama - SoLoMo", 15d, "Kahraman-Pelin Arslan", false),
                        new Book("Mobil Pazarlama - SoLoMo", 15d, "Kahraman-Pelin Arslan", true));

        modelAndView.addObject("kitaplar", kitaplar);

        return modelAndView;
    }
}
