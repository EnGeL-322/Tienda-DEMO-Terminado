package com.example.mscompras.Feign;

import com.example.mscompras.Dto.StockUpdateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//balanceo de carga
@FeignClient(name = "ms-inventario-service", path = "/inventory") // Solo operaciones de inventario
public interface InventoryClient {

    // Ruta para actualizar el stock
    @PostMapping("/update")
    void updateStock(@RequestBody StockUpdateDto dto);
}
