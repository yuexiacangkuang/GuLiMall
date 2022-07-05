package com.yuexia.gulimall.product;

import com.yuexia.gulimall.product.entity.BrandEntity;
import com.yuexia.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("特斯拉");
		brandService.save(brandEntity);
	}

}
