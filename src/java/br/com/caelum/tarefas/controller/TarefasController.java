/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.tarefas.controller;

import br.com.caelum.tarefas.modelo.Tarefa;
import br.com.caelum.tarefas.dao.TarefaDAO;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author PauloHenrique
 */
@Controller
public class TarefasController {
    
    private final TarefaDAO dao;
    
    @Autowired
    public TarefasController(TarefaDAO dao){
    
        this.dao = dao;
    }    
    @RequestMapping("novaTarefa")
    public String form(){
    
        return "tarefa/formulario";
    }
    
    @RequestMapping("adicionaTarefa")
    public String adiciona(@Valid Tarefa tarefa, BindingResult result){
        
        if(result.hasFieldErrors("descricao")){
            return "tarefa/formulario";
        }
        
        dao.adiciona(tarefa);
        return "tarefa/adicionada";
    }
    
    @RequestMapping("listaTarefas")
    public String lista(Model model){
    
        model.addAttribute("tarefas", dao.lista());
        return "tarefa/lista";
    }
    @RequestMapping("removeTarefa")
    public void remove(Tarefa tarefa, HttpServletResponse response){
    
        dao.remove(tarefa);
        response.setStatus(200);
    }
    @RequestMapping("mostraTarefa")
    public String mostra(Long id, Model model){
    
        model.addAttribute("tarefa", dao.buscaPorId(id));
        return "tarefa/mostra";
    }
    @RequestMapping("alteraTarefa")
    public String altera(Tarefa tarefa){
    
        dao.altera(tarefa);
        return "redirect:listaTarefas";
    }
    @RequestMapping("finalizaTarefa")
    public void finaliza(Long id, HttpServletResponse response){
	dao.finaliza(id);
	response.setStatus(200);
    }
    
}
