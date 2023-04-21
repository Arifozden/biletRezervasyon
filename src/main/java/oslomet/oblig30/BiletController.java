package oslomet.oblig30;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BiletController {
    private final List<Bilet>   biletler=new ArrayList<>();

    @PostMapping("/kaydet")
    public void kaydet(Bilet b){
        biletler.add(b);
    }

@GetMapping("/goster")
    public List<Bilet>goster(){
        return biletler;
}

@GetMapping("/sil")
    public void sil(){
        biletler.clear();
}
}
