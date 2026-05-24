package com.sistema.academia.internal.plano.mapper;

import com.sistema.academia.internal.plano.dto.PlanoRequestRecord;
import com.sistema.academia.internal.plano.dto.PlanoResponseRecord;
import com.sistema.academia.internal.plano.entity.PlanoEntity;

public class PlanoMapper {

    public static PlanoEntity toEntity(
            PlanoRequestRecord request){

        PlanoEntity plano = new PlanoEntity();

        plano.setNome(request.nome());
        plano.setValor(request.valor());
        plano.setDuracaoDias(request.duracaoDias());

        return plano;
    }

    public static PlanoResponseRecord toResponse(
            PlanoEntity plano){

        return new PlanoResponseRecord(
                plano.getId(),
                plano.getNome(),
                plano.getValor(),
                plano.getDuracaoDias()
        );
    }
}