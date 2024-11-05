package br.edu.unifei.ecot12.spiderman;

import java.util.ArrayList;
import java.util.List;

public class Prophecy {
    private String report;
    private List<LivingBeing> aboutWho = new ArrayList<LivingBeing>();
    
    public String getReport() {
        return report;
    }
    public void setReport(String report) {
        this.report = report;
    }
    public List<LivingBeing> getAboutWho() {
        return aboutWho;
    }
    public void setAboutWho(List<LivingBeing> aboutWho) {
        this.aboutWho = aboutWho;
    }
}
