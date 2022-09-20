package br.com.unicv.superbeauty.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.unicv.superbeauty.model.Agendamento;

@Component
public interface AgendamentoService {
    
    public Agendamento cadastrar(Agendamento agendamento);

    public Agendamento editar(Agendamento agendamento);

    public List<Agendamento> listar();

    public Agendamento buscarPorId(Integer codAgendamento); 

    public Agendamento buscarPorDataHora(LocalDateTime dataHora);

    public void excluir(Integer codAgendamento);

}