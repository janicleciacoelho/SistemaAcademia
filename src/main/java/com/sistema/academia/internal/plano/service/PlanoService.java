package com.sistema.academia.internal.plano.service;

import com.sistema.academia.config.exception.BusinessException;
import com.sistema.academia.internal.plano.dto.PlanoRequestRecord;
import com.sistema.academia.internal.plano.dto.PlanoResponseRecord;
import com.sistema.academia.internal.plano.entity.PlanoEntity;
import com.sistema.academia.internal.plano.mapper.PlanoMapper;
import com.sistema.academia.internal.plano.repository.PlanoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanoService {

    private final PlanoRepository repository;

    public PlanoResponseRecord salvar(
            PlanoRequestRecord request){

        if(repository.existsByNome(
                request.nome())){

            throw new BusinessException(
                    "Plano já cadastrado");
        }

        PlanoEntity plano =
                PlanoMapper.toEntity(request);

        repository.save(plano);

        return PlanoMapper.toResponse(
                plano
        );
    }

    public List<PlanoResponseRecord> listar(){

        return repository.findAll()
                .stream()
                .map(PlanoMapper::toResponse)
                .toList();
    }
}
