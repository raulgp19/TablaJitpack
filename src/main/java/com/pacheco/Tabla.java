package com.pacheco;

public class Tabla {
    public String calcular(int i)
    {
        System.out.println("----------------");
        String resultado = "Tabla del " + i + ":";
        for (int a = 1; a<11;a++)
        {
            int b = a*i;
            resultado += "\n" + i + " * " + a + " = " + b;
        }
        resultado+="\n"+"----------------";
        return resultado;
    }
}
