package Homeworks.Homework2;

public class Render {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void showIndicator(Object object){
        if (object instanceof HealthInterface){
            HealthInterface healthObject = (HealthInterface) object;
            if (healthObject.getCurrentHealthPoint() <= 30){
                System.out.println("Текущий уровень здоровья: " + ANSI_RED +  healthObject.getCurrentHealthPoint() + ANSI_RESET);
                System.out.println("Максимальный уровень здоровья: " + ANSI_GREEN +  healthObject.getMaxHealthPoint() + ANSI_RESET);
            }
            if (healthObject.getCurrentHealthPoint() > 30 && healthObject.getCurrentHealthPoint() <= 70){
                System.out.println("Текущий уровень здоровья: " + ANSI_YELLOW +  healthObject.getCurrentHealthPoint() + ANSI_RESET);
                System.out.println("Максимальный уровень здоровья: " + ANSI_GREEN +  healthObject.getMaxHealthPoint() + ANSI_RESET);
            }
            if (healthObject.getCurrentHealthPoint() > 70){
                System.out.println("Текущий уровень здоровья: " + ANSI_GREEN +  healthObject.getCurrentHealthPoint() + ANSI_RESET);
                System.out.println("Максимальный уровень здоровья: " + ANSI_GREEN +  healthObject.getMaxHealthPoint() + ANSI_RESET);
            }

        }
        if (object instanceof  ManaInterface){
            ManaInterface manaObject = (ManaInterface) object;
            if (manaObject.getCurrentManaPoint() <= 30){
                System.out.println("\nТекущий уровень магической энергии: " + ANSI_RED +  manaObject.getCurrentManaPoint() + ANSI_RESET);
                System.out.println("Максимальный уровень магической энергии: " + ANSI_GREEN +  manaObject.getMaxManaPoint() + ANSI_RESET);
            }
            if (manaObject.getCurrentManaPoint() > 30 && manaObject.getCurrentManaPoint() <= 70){
                System.out.println("\nТекущий уровень магической энергии: " + ANSI_YELLOW +  manaObject.getCurrentManaPoint() + ANSI_RESET);
                System.out.println("Максимальный уровень магической энергии: " + ANSI_GREEN +  manaObject.getMaxManaPoint() + ANSI_RESET);
            }
            if (manaObject.getCurrentManaPoint() > 70){
                System.out.println("\nТекущий уровень магической энергии: " + ANSI_GREEN +  manaObject.getCurrentManaPoint() + ANSI_RESET);
                System.out.println("Максимальный уровень магической энергии: " + ANSI_GREEN +  manaObject.getMaxManaPoint() + ANSI_RESET);
            }
        }
    }
}
