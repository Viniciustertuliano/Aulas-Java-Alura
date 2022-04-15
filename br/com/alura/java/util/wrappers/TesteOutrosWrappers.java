package util.wrappers;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {
        
        Integer idadeRef = Integer.valueOf(29); //Autoboxing
        System.out.println(idadeRef.intValue()); //Unboxing

        Double dRef = Double.valueOf(29.8); //Autoboxing
        System.out.println(dRef.intValue()); //Unboxing

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumber = Float.valueOf(45.6f);

        List<Number> lista = new ArrayList<>();
        lista.add(45);
        lista.add(25.6);
        lista.add(56.6f);
    }
}
