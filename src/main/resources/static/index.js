function rezerve(){
    let errorCounter=0;
    let girFilm=$("#film").val();
    if ((girFilm===null)||(girFilm==="Film sec")){
        errorCounter++;
        alert("Bir film seciniz");
    }
    let girAdet=$("#adet").val();
    if ((girAdet===null)||(girAdet==="")){
        errorCounter++;
        alert("Adet giriniz");
    }
    let girIsim=$("#isim").val();
    if ((girIsim===null)||(girIsim==="")){
        errorCounter++;
        alert("Isim giriniz");
    }
    let girSoysim=$("#soyisim").val();
    if ((girSoysim===null)||(girSoysim==="")){
        errorCounter++;
        alert("Soyisim giriniz");
    }
    let girTelefon=$("#telefon").val();
    if ((girTelefon===null)||(girTelefon==="")){
        errorCounter++;
        alert("Telefon numarasi giriniz");
    }
    let girEposta=$("#eposta").val();
    if ((girEposta===null)||(girEposta==="")){
        errorCounter++;
        alert("Eposta adresi giriniz");
    }
    if(errorCounter===0){
        const biletler={
            film:girFilm,
            adet:girAdet,
            isim:girIsim,
            soyisim:girSoysim,
            telefon:girTelefon,
            eposta:girEposta
        };

        $.post("/kaydet",biletler,function (){
            hepsiniGetir();
        })
        silici();
    }
}

function hepsiniGetir(){
    $.get("/goster",function (data){
        duzenle(data);
    });
}

function duzenle(alinanBiletler){
let yaz="<h3>Tum biletler</h3><table class='table table-striped'>" +
    "<tr class='table-info'><th>Film</th><th>Adet</th><th>Isim</th><th>Soyisim</th><th>Telefon</th><th>Eposta</th></tr>"
    for(let b of alinanBiletler){
        yaz+="<tr><td>"+b.film+"</td><td>"+b.adet+"</td><td>"+b.isim+"</td><td>"+b.soyisim+"</td><td>"+b.telefon+"</td><td>"+b.eposta+"</td>"
    }
    yaz+="</table>"
    $("#biletListe").html(yaz)
}

function sil(){
    $.get("/sil",function (){
        hepsiniGetir();
    });
}

function silici(){
    $("#film").val("")
    $("#adet").val("")
    $("#isim").val("")
    $("#soyisim").val("")
    $("#telefon").val("")
    $("#eposta").val("")
}