import java.util.Arrays;

public class StandardDeviation {

    public static Double stdDev(Double[] arr){
        
        //calculate mean

        Double y = 0.0;

        Double z = 0.0;

        for (Double x : arr) {
            
            y = y + x;

            z++;
            
        }

        Double mean = y / z;

        Double result = 0.0;

        for(Double x : arr){

            result = result + ((x - mean) * (x - mean));

        }

        result = Math.sqrt(result / (arr.length - 1));

        return temp;

    }
    
    public static void main(String[] args){

        String[] temp = args[0].split(", ");

        Double[] doubArr = new Double[args[0].split(", ").length];

        for (int x = 0; x < temp.length; x++){

            doubArr[x] = Double.parseDouble(temp[x]);

        }

        System.out.println(stdDev(doubArr));

    }
}
