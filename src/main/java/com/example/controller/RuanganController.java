package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.RuanganModel;

import com.example.service.RuanganService;

@Controller
public class RuanganController {
	
	@Autowired
	RuanganService ruanganDAO;
	
	@RequestMapping("/ruangan/viewall")
    public String viewAll (Model model)
    {
        List<RuanganModel> ruangan = ruanganDAO.selectAllRooms ();
        model.addAttribute ("ruangan", ruangan);

        return "viewall";
    }
	
	@RequestMapping("/ruangan/view/{id}")
    public String viewPath (Model model,
            @PathVariable(value = "id") String id)
    {
        RuanganModel ruangan = ruanganDAO.selectRoom (id);


            model.addAttribute ("ruangan", ruangan);
            return "viewdetail";
        
    }
	
	 @RequestMapping("/ruangan/update/{id}")
	    public String update (Model model, @PathVariable(value = "id") String id)
	    {
	    	 RuanganModel ruangan = ruanganDAO.selectRoom (id);

	       
	             model.addAttribute ("ruangan", ruangan);
	             return "updateruangan";
	       
	    	
	    }

}
