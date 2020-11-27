public class biblioteca{
    public void Libros(){ 
        
        libh to = new libh("Harry potter","Autores: Jakie ",0,2,"Tiene existencia");
        libt ladivina = new libt("el Kamasutra","Autor: Indi",1,0,"Tiene existencia");
        Biblio libpres = new Biblio();

        to.mostrarLibWiVe();
        ladivina.mostrarLibLaDivCo();
        libpres.LibPres();
    }
} 