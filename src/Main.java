public class Main {
    public static String bmiTest(double height, double weight){

        if(height>200 || height<150 || weight > 200 || weight < 40){
            return "invalid input";
        }
        else{
            double BMI = weight/((height/100)*(height/100));

            if(BMI>=16 && BMI<17){
                return "Moderate Thinness";
            }
            if(BMI>=17 && BMI<18.5){
                return "Mid Thinness";
            }
            if(BMI>=18.6&& BMI<25){
                return "Normal";
            }
            if(BMI>=25 && BMI<30){
                return "Overweight";
            }
            if(BMI>30 && BMI<35){
                return "Obese Class I";
            }
            if(BMI>=35 && BMI<40){
                return "Obese Class II";
            }
            if(BMI>=40) {
                return "Obese Class III";
            }
            return "Severe Thinness";
        }
    }
}