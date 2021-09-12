package com.demo.retailstoredemo.controller;

import com.demo.retailstoredemo.models.PartnerDetail;
import com.demo.retailstoredemo.services.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartnerController {

    @Autowired
    PartnerService partnerService;

    //Endpoints to perform normal CRUD operation on partner details
    @RequestMapping(value = "/addPartner", method = RequestMethod.POST)
    public int savePartner(PartnerDetail partnerDetail){
        PartnerDetail partner = partnerService.savePartner(partnerDetail);
        return partner.getId();
    }

    @RequestMapping(value = "/editPartner/{id}", method = RequestMethod.PUT)
    public PartnerDetail editPartner(@PathVariable Integer id, @RequestBody PartnerDetail partner){
        partnerService.editPartner(id, partner);
        return partner;
    }

    @RequestMapping(value = "/deletePartner/{id}", method = RequestMethod.DELETE)
    public Boolean deletePartner(@PathVariable Integer id){
        partnerService.deletePartner(id);
        return true;
    }

    @RequestMapping(value = "/partner/{id}")
    public PartnerDetail getPartner(@PathVariable Integer id){
        return partnerService.getPartner(id);
    }

    @RequestMapping("/allPartner")
    public List<PartnerDetail> allPartners(){
        List<PartnerDetail> allPartners = partnerService.allPartners();
        return allPartners;
    }

}
