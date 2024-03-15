package Laborator1;
public class TextUtil {
    public static String replaceWords(String text, int lungime, String subSir) {
        StringBuilder newText = new StringBuilder();
        String[] cuvinte = text.split("\\s+"); // Separa textul in cuvinte

        // Parcurge fiecare cuvant din text
        for (String cuvant : cuvinte) {
            if (cuvant.length() == lungime) {
                newText.append(subSir).append(" "); // Inlocuieste cuvantul cu subsirul
            } else {
                newText.append(cuvant).append(" "); // Pastreaza cuvantul nemodificat
            }
        }

        return newText.toString(); // Elimina spatiile de la inceput si sfarsit
    }
}