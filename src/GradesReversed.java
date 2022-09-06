public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        // [Вероника Чехова физика — Безупречно]
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < grades.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] words = grades[i].split(" ");
            words[4] = gradeStringToInt(words[4]);
            stringBuilder.append(String.join("," + words[0], words[1], words[2], words[4]));
            string.append(stringBuilder);
            string.append(";");
        }
        String serializeGrade = string.toString();
        return serializeGrade;
    }
}
