package LabStreamsFilesAndDirectories;

public class TryCathcFInally {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("3-w");
            System.out.println(number);
        } catch (NumberFormatException ex) {
            //System.out.println(ex.getMessage());
            // re throw - да хвърлиш грешката отново
            // и ако е под друг тип грещката, то програмата ще приклюяи
            //и ще пропусне finally(подава се throw new ТИПА на новата грешка
            //и променливата на първата грешка
            throw new IllegalStateException(ex);
        } finally {
            System.out.println("Finally");
        }
    }
}
