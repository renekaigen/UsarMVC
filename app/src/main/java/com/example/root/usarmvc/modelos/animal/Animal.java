package com.example.root.usarmvc.modelos.animal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.root.usarmvc.R;

/**
 * Created by root on 1/04/15.
 */
public class Animal {
    public String nombre;
    public String especie;
    private Context ctx;

    public Animal(){

    }

    public void setNombre(String s){
        nombre=s;
    }

    public void setEspecie(String s){
        especie=s;
    }

    public void setContext(Context context){
        ctx=context;

        /*evitar el this.  , porque afecta el perfomance en android pues al hacer this
            se sale del metodo actual y se va al top de la class y busca todas sus variables correspondientes.
        */
    }

    public ViewGroup renderizar(){
        ViewGroup vg=null;
        LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        vg=(ViewGroup) inflater.inflate(R.layout.plantilla_1,null);
        TextView v_nombre= (TextView)vg.findViewById(R.id.nombre_animal);
        v_nombre.setText(nombre);
        return vg;
    }

}
