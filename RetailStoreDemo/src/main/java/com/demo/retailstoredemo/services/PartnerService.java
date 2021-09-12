package com.demo.retailstoredemo.services;

import com.demo.retailstoredemo.models.PartnerDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PartnerService {

    List<PartnerDetail> listPartners = new ArrayList<>(

            Arrays.asList(
                    new PartnerDetail(1, "Mike", "Ndolo", "Senior", "Jamgad Solutions"),
                    new PartnerDetail(2, "Grace", "Jwenge", "Junior", "Microsoft"),
                    new PartnerDetail(3, "Adriel", "Maingi", "Associate", "Doshi Steels"),
                    new PartnerDetail(5, "Michelle", "Simiyu", "Senior", "Self")
            )


    );

    public PartnerDetail savePartner(PartnerDetail partnerDetail){
        listPartners.add(partnerDetail);
        return partnerDetail;
    }

    public PartnerDetail editPartner(Integer id, PartnerDetail partnerDetail){
        for (int i = 0; i < listPartners.size(); i++){
            PartnerDetail partner = listPartners.get(i);
            if(partner.getId().equals(id)){
                listPartners.set(i, partnerDetail);
            }
        }
        return partnerDetail;
    }

    public List<PartnerDetail> allPartners(){
        return listPartners;
    }

    public PartnerDetail getPartner(Integer id){
        return (PartnerDetail) listPartners.stream().filter(partner -> partner.getId().equals(id));
    }

    public void deletePartner(Integer id){
        for (int i = 0; i < listPartners.size(); i++){
            PartnerDetail partner = listPartners.get(i);
            if(partner.getId().equals(id)){
                listPartners.remove(partner);
            }
        }
    }

}
