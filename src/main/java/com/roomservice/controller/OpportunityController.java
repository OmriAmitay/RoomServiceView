package com.roomservice.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roomservice.dao.MongoDao;
import com.roomservice.entity.Operator;
import com.roomservice.entity.OpportunityFormData;

@Controller
@RequestMapping("/view")
public class OpportunityController {

    @GetMapping("/opportunity")
    public String greetingForm(Model model) {
    	Long opportunityId = MongoDao.getInstance().getMaxOpportunityId();
    	OpportunityFormData opportunityFormData = new OpportunityFormData();
    	opportunityFormData.setOpportunityId(opportunityId);
        
    	model.addAttribute("opportunityForm", opportunityFormData);
        model.addAttribute("operators", Operator.values());
        return "opportunityForm";
    }

    @PostMapping("/addOportunity")
    public String greetingSubmit(@Valid @ModelAttribute OpportunityFormData opportunityFormData, 
    	HttpServletResponse response) {
    	
    	boolean isValid = MongoDao.getInstance().importOpportunity(opportunityFormData);
    	if(! isValid) {
    		// invalid request message
    		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    	}
    	
        return "display";
    }

}