package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {

    private String word;

    public EndsWithQuestionOrExclamationMark() {
        this.word = "?";
    }

    @Override
    public boolean complies(String line) {
        if (line.length() >= 1) {
            Character c = line.charAt(line.length() - 1);

            if (c.toString().equals("?")) {
                return line.contains("?");
            } else if (c.toString().contains("!")) {
                return line.contains("!");
            }
        }
        return false;
    }
}
