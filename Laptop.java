public class Laptop {
    String firm;
    String color;
    Double screen;
    String os;
    Integer internalMemory;
    Integer ram;

    public Laptop(String firm,String color,Double screen,String os,Integer internalMemory,Integer ram){
        this.firm = firm;
        this.color = color;
        this.screen = screen;
        this.os = os;
        this.internalMemory = internalMemory;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return String.format("Фирма: %s,Цвет: %s, Диагональ экрана: %s, Операционная система: %s, Оперативная память: %s, Внутренняя память: %s", firm, 
        color, screen, os, internalMemory, ram);
    }
    public String getFirm() {
        return firm;
    }
    public String getColor() {
        return color;
    }
    public Double getScreen() {
        return screen;
    }
    public String getOs() {
        return os;
    }
    public Integer getInternalMemory() {
        return internalMemory;
    }
    public Integer getRam() {
        return ram;
    }
    public void setFirm(String firm) {
        this.firm = firm;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setScreen(Double screen) {
        this.screen = screen;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setInternalMemory(Integer internalMemory) {
        this.internalMemory = internalMemory;
    }
    public void setRam(Integer ram) {
        this.ram = ram;
    }

}
