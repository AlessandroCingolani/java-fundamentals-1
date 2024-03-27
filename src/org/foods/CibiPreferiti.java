package org.foods;

public class CibiPreferiti {
    public static void main(String[] args) {
        String[] favouriteFoods = {"Cannelloni","Pizza","Timballo","Cozze","Hamburger","Sushi","Pinza"};
        System.out.println("Nella classifica hai "+ favouriteFoods.length + " cibi preferiti");
        System.out.println("Il tuo cibo preferito è : "+ favouriteFoods[0]);
        System.out.println("Il cibo ultimo in classifica è : "+ favouriteFoods[favouriteFoods.length - 1]);
        System.out.println("Il cibo a metà classifica : "+ favouriteFoods[favouriteFoods.length / 2]);
    }
}
