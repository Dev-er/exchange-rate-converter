package Converter;

public class Converter {
    private String base_code;
    private String target_code;
    private  double conversion_result;
    private double conversion_rate;
    private double value;

    public Converter(String base_code, String target_code, double value){
        this.base_code = base_code;
        this.target_code = target_code;
        this.value = value;
    }

    public Converter() {

    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "base_code='" + base_code + '\'' +
                ", target_code='" + target_code + '\'' +
                ", conversion_result=" + conversion_result +
                ", conversion_rate=" + conversion_rate +
                '}';
    }
}
