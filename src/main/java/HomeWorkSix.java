public class HomeWorkSix {
    public Long[] doubleLengthArray(Long[] input) {
        Long[] output = new Long[input.length * 2];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        for (int i = input.length; i < output.length; i++){
            output[i] = 0L;
        }
        return output;
    }

    public Long[] multiplyValuesinAnArray(Long[] input, int multiplier) {
        Long[] output = new Long[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i] * multiplier;
        }
        return output;
    }
}
