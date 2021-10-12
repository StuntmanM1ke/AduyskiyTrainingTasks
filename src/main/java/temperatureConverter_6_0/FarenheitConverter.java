package temperatureConverter_6_0;

public class FarenheitConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
