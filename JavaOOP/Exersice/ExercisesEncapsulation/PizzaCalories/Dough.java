package ExercisesEncapsulation.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setWeight(weight);
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
    }

    private void setWeight(double weight) {
        if (weight < 0 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("Wholegrain") && !flourType.equals("White")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        //crispy, chewy or homemade
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        double modifierOfFlour = DoughType.valueOf(flourType.toUpperCase()).getModifier();
        double modifierOfBakingTechnique = DoughType.valueOf(bakingTechnique.toUpperCase()).getModifier();
        return 2 * weight * modifierOfFlour * modifierOfBakingTechnique;
    }

}
