
package entidades;

import java.util.ArrayList;
import java.util.List;
import entidades.Notas;
import java.util.stream.Collectors;


public class ConjuntoDeNotas {
    private List<Notas> listNotas = new ArrayList<>();
    private Double media;
    public ConjuntoDeNotas() {
    }
    public void addNotas(Notas notas){
    listNotas.add(notas);
    }
    public void removeNotas(Notas notas){
    listNotas.remove(notas);
    }
    public Double mediaNotas(){
    Double soma=0.0;
    for(Notas obgMedia:listNotas){
   
    soma+=obgMedia.getNota();
    }
    Double media=soma/listNotas.size();
    this.media=media;
    return media;
    }
    public void maxNotas(){
    
    List<Notas> maioresNotas = listNotas.stream().filter(x->x.getNota()>this.media).collect(Collectors.toList());
    
    for(Notas objNotas : maioresNotas ){
    
        System.out.println("Notas maiores que a media"+objNotas.getNota());
    
    }
    }
     public void minNotas(){
    
    List<Notas> maioresNotas = listNotas.stream().filter(x->x.getNota()<this.media).collect(Collectors.toList());
    
    for(Notas objNotas : maioresNotas ){
    
        System.out.println("Notas menores que a media"+objNotas.getNota());
    
    }
    }
    }

