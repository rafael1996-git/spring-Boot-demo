package com.ine.cartografia.controlador;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ine.cartografia.dao.IServiceDao;
import com.ine.cartografia.entity.Usuario;
import com.ine.cartografia.service.IDaoService;

@Controller
public class Controlador {
	private final Logger logger = LoggerFactory.getLogger(Controlador.class);

	@Autowired
	private IDaoService Consulta;
	  
	   @GetMapping("/demo")
	   public ModelAndView passParametersWithModelAndView(HttpServletRequest request) throws  Exception{
		   List<Usuario> lista = Consulta.GetAll();
		   logger.debug("consulta "+lista);
		   request.setAttribute("lista", lista);
		    ModelAndView modelAndView = new ModelAndView("index");

		    return modelAndView;
		}
	   @ResponseBody
	   @GetMapping("/")
		public List<Usuario> index(HttpServletRequest request) throws  Exception{
		   List<Usuario> lista = Consulta.GetAll();
		   logger.debug("consulta "+lista);
			return lista;
		}
}
