public class Variables {
    public static void main(String args[]){
        //Para definir una variable debemos de qué tipo es
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        //Si queremos cambiar el valor de una variable, no es necesario volver a especificar el tipo de variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        //Una variable de tipo string se define coon "String" (Siempre comienza con mayúscula)
        String miVariableString = "Saludos";
        System.out.println(miVariableString);

        miVariableString = "Adios";
        System.out.println(miVariableString);

        //Se puede utilizar "var" para no especificar qué tipo de dato es, sino que Java lo detecta solo
        var miNuevaVariable = 15;
        System.out.println(miNuevaVariable);

        var miVariableString2 = "Variable var";
        System.out.println(miVariableString2);
    }
}
