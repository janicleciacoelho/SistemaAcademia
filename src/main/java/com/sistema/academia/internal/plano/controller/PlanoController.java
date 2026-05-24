package com.sistema.academia.internal.plano.controller;

import com.sistema.academia.internal.plano.dto.PlanoRequestRecord;
import com.sistema.academia.internal.plano.dto.PlanoResponseRecord;
import com.sistema.academia.internal.plano.service.PlanoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/planos")
@RequiredArgsConstructor
public class PlanoController {

    private final PlanoService service;

    @PostMapping
    public ResponseEntity<PlanoResponseRecord>
    salvar(

            @RequestBody
            @Valid
            PlanoRequestRecord request){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.salvar(request));
    }

    @GetMapping
    public ResponseEntity<List<PlanoResponseRecord>>
    listar(){

        return ResponseEntity.ok(
                service.listar()
        );
    }
}