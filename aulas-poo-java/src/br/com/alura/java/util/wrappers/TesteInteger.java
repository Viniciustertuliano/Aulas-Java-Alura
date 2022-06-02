package util.wrappers;


public class TesteInteger{
    public static void main(String[] args) {
        int idade = 29;

        Integer idadeRef = Integer.valueOf(29); //Autoboxing
        int valor = idadeRef.intValue(); //Unboxing

        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);



        //String s = args[0];

        //Integer numero = Integer.valueOf(s);

        //int numero = Integer.parseInt(s)

    }
}