public class PoemFixer {
    public static void main(String[] args) {
        System.out.println();
        String[] str = {"Вероника Чехова физика — Безупречно", "Анна Строкова математика — Потрясающе", "Иван Петров геометрия — Безупречно"};
        GradesReversed gradesReversed = new GradesReversed();
        String neo = gradesReversed.serializeGrades(str);
        System.out.println(neo);
    }
}
