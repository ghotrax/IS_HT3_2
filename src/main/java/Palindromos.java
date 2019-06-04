public class Palindromos{
    public static void main(String args[]){
        evaluate("somos");
        evaluate(null);
        evaluate("");
        evaluate("aa");
        evaluate("Oso");
        evaluate("sdasdasdkjfkajsdkasjdkajsdkajsdkljaskldjaksjdklajsdkjaksdjkasjdkfhajhsaskdjkasjkdaksdjklajkgjksdkahjdjahsjdhajsdhjashdjahsdjashdjashdjahsdjahsjkdahsjdhasjdhasjdkhkjasd");
        evaluate("%&(oro.");
        evaluate("soos");
    }

    public static Object evaluate(String palabraIngresada) {
        if (palabraIngresada == null) {
            System.out.println("Probando "+palabraIngresada+" - Resultado "+palabraIngresada);
            return null;
        }

        if(palabraIngresada.isEmpty()){
            System.out.println("Probando "+palabraIngresada+" - Resultado "+palabraIngresada);
            return palabraIngresada;
        }

        if(palabraIngresada.length()<3){
            System.out.println("Probando "+palabraIngresada+" - Resultado "+palabraIngresada);
            return palabraIngresada;
        }


        if(palabraIngresada.matches(".*(\\s)")){
            System.out.println("Probando "+palabraIngresada+" - Resultado  ");
            return "";
        }

        if(palabraIngresada.length()>200){
            System.out.println("Probando "+palabraIngresada+" - Resultado  ");
            return "";
        }

        if(!palabraIngresada.matches("^[a-z]+$")){
            System.out.println("Probando "+palabraIngresada+" - Resultado \"solo letras o numeros\"");
            return "solo letras o numeros";
        }


        if(palabraIngresada.length()%2==0){
            System.out.println("Probando "+palabraIngresada+" - Resultado 0");
            return  0;
        }

        boolean result = true;
        int length = palabraIngresada.length();
        for (int i = 0; i < length / 2; i++) {
            if (palabraIngresada.charAt(i) != palabraIngresada.charAt(length - 1 - i)) {
                result = false;
                break;
            }
        }

        System.out.println("Probando "+palabraIngresada+" - Resultado "+result);
        return result;
    }
}