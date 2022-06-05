package phoneBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    private Ram ram;
    private Rom rom;
    private Os os;
    private Cpu cpu;

    public Phone(@Autowired Ram ram,
                 @Autowired Rom rom,
                 @Autowired Os os,
                 @Autowired Cpu cpu) {
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Rom getRom() {
        return rom;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
