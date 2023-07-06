package com.belkovicsd.myproject;

import com.belkovicsd.myproject.controller.ProductRepository;
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
class ProductServiceTests {

    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    void beforeEach() {
        productService = new ProductService(productRepository);
    }

    @Test
    void getProductsTest() {
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
        when(productRepository.findAll()).thenReturn(product);

        //When
        var actual = productService.getProducts();

        //Then
        assertThat(actual).isEqualTo(product);
    }

    @Test
    void uploadProductTest() {
        //Given
        var product = new Product();
        when(productRepository.save(product)).thenReturn(product);

        //When
        productService.uploadProduct(product);

        //Then
        verify(productRepository, times(1)).save(product);
    }

}