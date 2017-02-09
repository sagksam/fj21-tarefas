/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.tarefas.controller;

import br.com.caelum.tarefas.dao.TarefaDAO;
import br.com.caelum.tarefas.dao.UsuarioDAO;
import br.com.caelum.tarefas.modelo.Usuario;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author PauloHenrique
 */
@Controller
public class LoginController {
    
    @RequestMapping("loginForm")
    public String loginForm(){
    
        return "formulario-login";
    }
    
    @RequestMapping("efetuaLogin")
    public String efetuaLogin(Usuario usuario, HttpSession session){
    
        if(new UsuarioDAO().existeUsuario(usuario)){
        
            session.setAttribute("usuarioLogado", usuario);
            return "menu";
        }
        return "redirect:loginForm";
    }
    @RequestMapping("logout")
    public String logout(HttpSession session){
    
        session.invalidate();
        return "redirect:loginForm";
    }
}
