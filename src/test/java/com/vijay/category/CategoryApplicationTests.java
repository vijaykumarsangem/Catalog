package com.vijay.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CategoryApplicationTests {

    @Test
    void salesTest(){
        Map<Integer,Double> categories=Catalog.buildCategories();
        Map<Integer,Double> m=new HashMap<>();
        m.put(1,60.0);
        m.put(2,150.0);
        m.put(3,70.0);
        Assertions.assertEquals(m,categories);
    }
}
