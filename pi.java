
/**
 * Calcula o valor aproximado de Pi
 */
public class pi {

    public static void main(String[] args) {
        Double inside_circle = 0.0;
        Double total_square = 0.0;

        for(int i = 1; i <= 10000000; i++){
            Double x = Math.random();
            Double y = Math.random();

            if(1 >= (Math.pow(x,2) + Math.pow(y,2))){
                inside_circle++;
            }
            total_square++; 
        }
        Double pi = (4*inside_circle)/total_square;

        System.out.println(pi);

       
        
    }
}