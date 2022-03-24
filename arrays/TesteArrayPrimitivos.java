package arrays;

//array[]
public class TesteArrayPrimitivos {
    public static void main(String[] args) {
        //int[] idades;
        int[] idades = new int[5];// Inicializa com os valores padroes (0)

        // Inicializando array com for
        for(int i = 0; i < idades.length; i++){
            idades[i] = i * i;
        }

        //Percorrendo array com for
        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    
    }
}
