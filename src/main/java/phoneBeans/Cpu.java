package phoneBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
    private int countOfPowerfulCores;
    private int countOfEfficiencyCores;
    private double frequencyOfPowerfulCores;
    private double frequencyOfEfficiencyCores;

    public Cpu(
            @Value("${cpu.countOfPowerfulCores}")
                    int countOfPowerfulCores,
            @Value("${cpu.countOfEfficiencyCores}")
                    int countOfEfficiencyCores,
            @Value("${cpu.frequencyOfPowerfulCores}")
                    double frequencyOfPowerfulCores,
            @Value("${cpu.frequencyOfEfficiencyCores}")
                    double frequencyOfEfficiencyCores) {
        this.countOfPowerfulCores = countOfPowerfulCores;
        this.countOfEfficiencyCores = countOfEfficiencyCores;
        this.frequencyOfPowerfulCores = frequencyOfPowerfulCores;
        this.frequencyOfEfficiencyCores = frequencyOfEfficiencyCores;
    }

    public int getCountOfPowerfulCores() {
        return countOfPowerfulCores;
    }

    public void setCountOfPowerfulCores(int countOfPowerfulCores) {
        this.countOfPowerfulCores = countOfPowerfulCores;
    }

    public int getCountOfEfficiencyCores() {
        return countOfEfficiencyCores;
    }

    public void setCountOfEfficiencyCores(int countOfEfficiencyCores) {
        this.countOfEfficiencyCores = countOfEfficiencyCores;
    }

    public double getFrequencyOfPowerfulCores() {
        return frequencyOfPowerfulCores;
    }

    public void setFrequencyOfPowerfulCores(double frequencyOfPowerfulCores) {
        this.frequencyOfPowerfulCores = frequencyOfPowerfulCores;
    }

    public double getFrequencyOfEfficiencyCores() {
        return frequencyOfEfficiencyCores;
    }

    public void setFrequencyOfEfficiencyCores(double frequencyOfEfficiencyCores) {
        this.frequencyOfEfficiencyCores = frequencyOfEfficiencyCores;
    }
}
