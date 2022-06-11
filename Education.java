public class Education implements Cloneable {
    private String degree;
    private String major;
    private int research;

    public Education() {
    }

    public Education(String degree, String major, int research) {
        this.degree = degree;
        this.major = major;
        this.research = research;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getResearch() {
        return research;
    }

    public void setResearch(int research) {
        this.research = research;
    }

    @Override
    public Education clone() {
        try {
            Education clone = (Education) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
