package com.mycompany.serverhttp;
import java.util.ArrayList;
public class Alunni {
   private ArrayList<Alunno> array;

    public Alunni()
    {
        array = new ArrayList<>();
    }

    public int getSize() {
        return array.size();
    }
    
    public ArrayList<Alunno> getArray() {
        return array;
    }

    public void setArray(ArrayList<Alunno> array) {
        this.array = array;
    }
    public void add(Alunno a)
    {
        array.add(a);
    }
}
