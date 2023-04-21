package oslomet.oblig30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BiletController {
    //private final List<Bilet>   biletler=new ArrayList<>();

    @Autowired
     BiletRepository bilRep;

    @PostMapping("/kaydet")
    public void kaydet(Bilet b){
       bilRep.kaydetBilet(b);
    }


    @GetMapping("/goster")
        public List<Bilet>goster(){
        return bilRep.hepsiniGetirr();
    }

    @GetMapping("/sil")
    public void sil(){
        bilRep.silBilet();
    }
}
