package ExamPrep.vetClinic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.capacity > data.size()) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(pet ->
                pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return data.stream().filter(p -> p.getName().equals(name)
                && p.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    public Pet getOldestPet() {
        return data.stream()
                .max(Comparator.comparingInt(Pet::getAge))
                .get();
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The clinic has the following patients:")
                .append(System.lineSeparator());
        for (Pet pet : data) {
            sb.append(pet.getName()).append(" ").append(pet.getOwner())
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }


}
