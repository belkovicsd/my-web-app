package com.belkovicsd.myproject;

import com.belkovicsd.myproject.controller.ProductController;
import com.belkovicsd.myproject.controller.ProductService;
import com.belkovicsd.myproject.model.Color;
import com.belkovicsd.myproject.model.Product;
import com.belkovicsd.myproject.model.Size;
import com.belkovicsd.myproject.model.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductControllerTests {

	private ProductController productController;

	@Mock
	private ProductService productService;

	@BeforeEach
	void beforeEach() {
		productController = new ProductController(productService);
	}

	@Test
	void getAllProductsTest() {
		//Given
		var product = List.of(
				new Product(
						1L,
						"TestName",
						List.of(Color.BLACK, Color.BLUE),
						List.of(Size.S, Size.M, Size.L),
						Type.SHIRT,
						29.99
				)
		);
		when(productService.getProducts()).thenReturn(product);

		//When
		var actual = productController.getAllProducts();

		//Then
		assertThat(actual).isEqualTo(product);
	}

	@Test
	void uploadProductTest() {
		//Given
		var product = new Product();
		doNothing().when(productService).uploadProduct(product);

		//When
		productController.uploadProduct(product);

		//Then
		verify(productService, times(1)).uploadProduct(product);
	}

}
