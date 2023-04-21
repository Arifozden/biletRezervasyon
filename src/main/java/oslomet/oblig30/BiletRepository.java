package oslomet.oblig30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class BiletRepository {

    @Autowired
    private JdbcTemplate db;

    public void kaydetBilet(Bilet girBilet){
        String sql="INSERT INTO Bilet (film,adet,isim,soyisim,telefon,eposta) VALUES (?,?,?,?,?,?)";
        db.update(sql,girBilet.getFilm(),girBilet.getAdet(),girBilet.getIsim(),girBilet.getSoyisim(),girBilet.getTelefon(),girBilet.getEposta());
    }

    public List<Bilet> hepsiniGetirr(){
        String sql="SELECT * FROM Bilet ORDER BY Soyisim";
        List<Bilet>tumBilet=db.query(sql, new BeanPropertyRowMapper<>(Bilet.class));
        return tumBilet;
    }

    public void silBilet(){
        String sql="DELETE FROM Bilet";
        db.update(sql);
    }
}
