package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> tail = new ArrayList<>();

        for(int i=0; i<value.length(); i++){
            tail.add(i, value.substring(i,value.length()));
        }

        return tail;
    }

}
