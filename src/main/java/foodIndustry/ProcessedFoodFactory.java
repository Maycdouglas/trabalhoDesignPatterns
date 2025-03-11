package foodIndustry;

import java.lang.reflect.Constructor;

public class ProcessedFoodFactory {
    public static IProcessedFood processFood(String processedFood) {
        Class<?> classe;
        Object objeto;

        try{
            classe = Class.forName("foodIndustry." + processedFood);
            Constructor<?> constructor = classe.getDeclaredConstructor();
            objeto = constructor.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Alimento processado inexistente.");
        }

        if(!(objeto instanceof IProcessedFood)){
            throw new IllegalArgumentException("Alimento processado inválido.");
        }
        return (IProcessedFood) objeto;
    }
}
