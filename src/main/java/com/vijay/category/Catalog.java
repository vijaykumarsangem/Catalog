package com.vijay.category;

import com.vijay.category.model.Category;
import com.vijay.category.model.Sales;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Catalog {

    public void buildCategories(){
        Sales s1=new Sales(1,1,1,10.0,10.0);
        Sales s2=new Sales(2,1,1,20.0,20.0);
        Sales s3=new Sales(3,1,2,30.0,30.0);
        Sales s4=new Sales(4,2,2,40.0,40.0);
        Sales s5=new Sales(5,2,5,50.0,50.0);
        Sales s6=new Sales(6,2,6,60.0,60.0);
        Sales s7=new Sales(7,3,7,70.0,70.0);
        List<Sales> sales = new ArrayList<>();
        sales.add(s1);
        sales.add(s2);
        sales.add(s3);
        sales.add(s4);
        sales.add(s5);
        sales.add(s6);
        sales.add(s7);

        Category c1 = new Category(1,"a",Arrays.asList(new Category(2,"abc",null),new Category()),100.0,10.0);
        Category c2 = new Category(2,"b",Arrays.asList(new Category(1,"cde",null)),10.0,10.0);
//        Category c3 = new Category(3,"c",Arrays.asList(s3),20.0,10.0);
//        Category c4 = new Category(4,"d",Arrays.asList(s4),130.0,10.0);
//        Category c5 = new Category(5,"e",Arrays.asList(s5),140.0,10.0);
//        Category c6 = new Category(6,"f",Arrays.asList(s6),150.0,10.0);
//        List<Category> c= new ArrayList<>();
//        c.add(c1);
//        c.add(c2);
//        c.add(c3);
//        c.add(c4);
//        c.add(c5);
//        c.add(c6);
        Map<Sales, List<Sales>> map = new HashMap<>();

//        c.stream().map(n->n.getTotalSales()>100.0).collect(Collectors.toList());

//        c.stream().map(Category::getChildren).flatMap(Collection::stream).filter(a->a.getAmount()<100.0).collect(Collectors.toList()).forEach(System.out::println);
//        c.stream().filter(e->e.getChildren().stream().anyMatch(b->b.getAmount()<20)).forEach(System.out::println);
//        c.stream().filter(category -> category.getTotalSales()<100).collect(Collectors.groupingBy(Sales::getLeafCategoryId));

        Map<Integer, Double> total =
                sales.stream().collect(Collectors.groupingBy(Sales::getLeafCategoryId,
                        Collectors.summingDouble(Sales::getAmount)));
        System.out.println(total);
}
    }