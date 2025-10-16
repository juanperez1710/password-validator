public class PasswordValidator {
    public boolean isValid(String password){
        if(password == null || password.length()<6){
            return false;
        }
        boolean tieneMayus=false;
        boolean tieneNumero=false;
        boolean tieneEspChar=false;
        final String caracteres_Especiales="!@#%^&*$";

        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)){
                tieneMayus=true;
            } else if (Character.isDigit(c)){
                tieneNumero=true;
            }else if (caracteres_Especiales.indexOf(c)>=0){
                tieneEspChar=true;
            }

            if(tieneMayus && tieneNumero && tieneEspChar){
                break;
            }
        }//Fin for
        return tieneMayus && tieneNumero && tieneEspChar;
    }//Fin clase isValid
}//Fin clase PasswordValidator
