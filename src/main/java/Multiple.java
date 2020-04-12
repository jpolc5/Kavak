public class Multiple {
     String result;
     String ismultiple35orboth(int number){
        if (number % 3 == 0 && number % 5 != 0){
            result = "A";
        }else if (number % 3 != 0 && number % 5 == 0){
            result = "B";
        }else if (number % 3 == 0 && number % 5 == 0){
            result = "Multiple of Both";
        }else if(number % 3 != 0 && number % 5 != 0) {
            result = "";
        }return result;
    }
}
