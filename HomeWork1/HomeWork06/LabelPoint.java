package HomeWork06;

public class LabelPoint extends Point{
    private String label;

    public LabelPoint(String label) {
        this.label = label;
    }

    public LabelPoint(String label,String x, String y) {
        super(x, y);
        this.label = label;
    }

    public void print(){
        System.out.println(getLabel()+" " + getX()+" "+getY());
    }

    public String getLabel() {

        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
